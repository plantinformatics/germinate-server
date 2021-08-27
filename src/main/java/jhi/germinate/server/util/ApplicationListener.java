package jhi.germinate.server.util;

import com.thetransactioncompany.cors.*;
import jhi.germinate.resource.enums.ServerProperty;
import jhi.germinate.server.*;
import jhi.germinate.server.util.tasks.*;
import jhi.oddjob.*;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import java.io.File;
import java.util.*;
import java.util.concurrent.*;
import java.util.logging.*;

/**
 * The {@link ApplicationListener} is the main {@link ServletContextListener} of the application. It's started when the application is loaded by
 * Tomcat. It contains {@link #contextInitialized(ServletContextEvent)} which is executed on start and {@link #contextDestroyed(ServletContextEvent)}
 * which is executed when the application terminates.
 *
 * @author Sebastian Raubach
 */
@WebListener
public class ApplicationListener implements ServletContextListener
{
	// TODO: Init async scheduler based on config
	public static final IScheduler SCHEDULER = new ProcessScheduler();

	private static ScheduledExecutorService backgroundScheduler;

	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		logMessage();

		try
		{
			Properties props = new Properties();
			props.setProperty("cors.supportedMethods", "GET, POST, HEAD, OPTIONS, PATCH, DELETE, PUT");
			final FilterRegistration.Dynamic corsFilter = sce.getServletContext().addFilter("CORS", new CORSFilter(new CORSConfiguration(props)));
			corsFilter.setInitParameter("cors.supportedMethods", "GET, POST, HEAD, OPTIONS, PATCH, DELETE, PUT");
			corsFilter.addMappingForUrlPatterns(null, false, "/*");
		}
		catch (CORSConfigurationException e)
		{
			e.printStackTrace();
		}

		try
		{
			SCHEDULER.initialize();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		PropertyWatcher.initialize();

		Long asyncDeleteDelay = PropertyWatcher.getLong(ServerProperty.FILES_DELETE_AFTER_HOURS_ASYNC);
		Long tempDeleteDelay = PropertyWatcher.getLong(ServerProperty.FILES_DELETE_AFTER_HOURS_TEMP);

		backgroundScheduler = Executors.newSingleThreadScheduledExecutor();
		// Every hour, update the dataset sizes
		backgroundScheduler.scheduleAtFixedRate(new DatasetMetaTask(), 1, 1, TimeUnit.HOURS);
		// Every minute, check the async job status
		backgroundScheduler.scheduleAtFixedRate(new DatasetExportJobCheckerTask(), 1, 1, TimeUnit.MINUTES);
		backgroundScheduler.scheduleAtFixedRate(new DatasetImportJobCheckerTask(), 1, 1, TimeUnit.MINUTES);
		// Every 5 minutes, get an update on the user information from Gatekeeper
		if (!StringUtils.isEmpty(PropertyWatcher.get(ServerProperty.GATEKEEPER_URL)))
			backgroundScheduler.scheduleAtFixedRate(new GatekeeperUserUpdaterTask(), 1, 5, TimeUnit.MINUTES);
		// Every specified amount of hours, delete the async folders that aren't needed anymore
		if (asyncDeleteDelay != null)
			backgroundScheduler.scheduleAtFixedRate(new AsyncFolderCleanupTask(), 0, asyncDeleteDelay, TimeUnit.HOURS);

		if (tempDeleteDelay != null)
		{
			// Every specified amount of hours, delete the temp files
			backgroundScheduler.scheduleAtFixedRate(new TempFolderCleanupTask(), 0, tempDeleteDelay, TimeUnit.HOURS);
		}

		// Every 4 hours, update the PDCI
		if (PropertyWatcher.getBoolean(ServerProperty.PDCI_ENABLED))
			backgroundScheduler.scheduleAtFixedRate(new PDCITask(), 0, 4, TimeUnit.HOURS);
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent)
	{
		PropertyWatcher.stopFileWatcher();
		GatekeeperClient.close();

		try
		{
			SCHEDULER.destroy();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			// Stop the scheduler
			if (backgroundScheduler != null)
				backgroundScheduler.shutdownNow();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		Database.close();
	}

	/**
	 * Returns the file with the given name from the external data folder in the given sub directory structure
	 *
	 * @param filename The name of the file to return
	 * @param subdirs  Optional sub-directory structure
	 * @return The {@link File} representing the request
	 */
	public static File getFromExternal(String filename, String... subdirs)
	{
		File folder = new File(PropertyWatcher.get(ServerProperty.DATA_DIRECTORY_EXTERNAL));

		if (subdirs != null)
		{
			for (String subdir : subdirs)
			{
				folder = new File(folder, subdir);
			}
		}

		return new File(folder, filename);
	}

	private void logMessage()
	{
		Logger.getLogger("").log(Level.INFO, "\r\n" +
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@#################%@@@@@@@////////%@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@#####################@@@@@@@#///////(@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@#######################@@@@@@@@////////@@@@@@@@@@\r\n" +
			"@@@@@@@@@((((((((@@@@@@@@@@@@@@@@@@@@@@@@@////////@@@@@@@@@\r\n" +
			"@@@@@@@@((((((((@@@@@@@@@@@@@@@@@@@@@@@@@@@////////@@@@@@@@\r\n" +
			"@@@@@@@((((((((@@@@@@@@@@@@@@@@@@@@@@@@@@@@@////////@@@@@@@\r\n" +
			"@@@@@&((((((((@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@////////@@@@@@\r\n" +
			"@@@@#(((((((/@@@@@@@@@@@@@@@@@@@@@@@((((((((((//////##%@@@@\r\n" +
			"@@@((((((((@@@@@@@@@@@@@@@@@@@@@@@@(((((((((((((///####%@@@\r\n" +
			"@@@(((((((@@@@@@@@@@@@@@@@@@@@@@@@(((((((((((((((/######@@@\r\n" +
			"@@@(((((((@@@@@@@@,,,,,,,,,,,,,,,*@@@@@@@@(((((((#######@@@\r\n" +
			"@@@((((((((@@@@@@@@,,,,,,,,,,,,,***@@@@@@@@(((((#######%@@@\r\n" +
			"@@@@/(((((((#@@@@@@@,,,,,,,,,,,*****@@@@@@@@(((#######%@@@@\r\n" +
			"@@@@@@((((((((@@@@@@@@@@@@@@@********@@@@@@@@########@@@@@@\r\n" +
			"@@@@@@@((((((((@@@@@@@@@@@@@********@@@@@@@@########@@@@@@@\r\n" +
			"@@@@@@@@((((((((@@@@@@@@@@@********@@@@@@@@########@@@@@@@@\r\n" +
			"@@@@@@@@@((((((((@@@@@@@@@********@@@@@@@@########@@@@@@@@@\r\n" +
			"@@@@@@@@@@((((((((///////////////@@@@@@@@########@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@((((((((////////////*@@@@@@@%#######%@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@(((((((//////////@@@@@@@@########%@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
			"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" +
			"\r\n" +
			"               Thanks for using Germinate!\r\n");
	}
}