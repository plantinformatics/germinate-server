package jhi.germinate.server.resource.datasets;

import com.google.gson.*;
import jhi.gatekeeper.resource.PaginatedResult;
import jhi.germinate.resource.PaginatedRequest;
import jhi.germinate.resource.enums.*;
import jhi.germinate.server.*;
import jhi.germinate.server.database.codegen.tables.pojos.ViewTableDatasets;
import jhi.germinate.server.resource.*;
import jhi.germinate.server.util.*;
import org.jooq.*;

import java.sql.*;
import java.util.*;

import static jhi.germinate.server.database.codegen.tables.Datasetpermissions.*;
import static jhi.germinate.server.database.codegen.tables.Usergroupmembers.*;
import static jhi.germinate.server.database.codegen.tables.Usergroups.*;
import static jhi.germinate.server.database.codegen.tables.ViewTableDatasets.*;

public class BaseDatasetTableResource extends ExportResource implements IFilteredResource
{
	public PaginatedResult<List<ViewTableDatasets>> runQuery(PaginatedRequest request, DatasetTableResource.AdjustQuery optionalAdjuster)
		throws SQLException
	{
		AuthenticationMode mode = PropertyWatcher.get(ServerProperty.AUTHENTICATION_MODE, AuthenticationMode.class);

		AuthenticationFilter.UserDetails userDetails = (AuthenticationFilter.UserDetails) securityContext.getUserPrincipal();

		processRequest(request);
		try (Connection conn = Database.getConnection())
		{
			DSLContext context = Database.getContext(conn);
			SelectSelectStep<Record> select = context.select();

			if (previousCount == -1)
				select.hint("SQL_CALC_FOUND_ROWS");

			SelectJoinStep<Record> from = select.from(VIEW_TABLE_DATASETS);

			if (!userDetails.isAtLeast(UserType.ADMIN))
			{
				// Check if the dataset is public or if the user is part of a group that has access or if the user has access themselves
				from.where(VIEW_TABLE_DATASETS.DATASET_STATE.eq("public")
															.orExists(context.selectOne().from(DATASETPERMISSIONS)
																			 .leftJoin(USERGROUPS).on(USERGROUPS.ID.eq(DATASETPERMISSIONS.GROUP_ID))
																			 .leftJoin(USERGROUPMEMBERS).on(USERGROUPMEMBERS.USERGROUP_ID.eq(USERGROUPS.ID))
																			 .where(DATASETPERMISSIONS.DATASET_ID.eq(VIEW_TABLE_DATASETS.DATASET_ID))
																			 .and(USERGROUPMEMBERS.USER_ID.eq(userDetails.getId())
																										  .or(DATASETPERMISSIONS.USER_ID.eq(userDetails.getId())))));
			}

			if (optionalAdjuster != null)
				optionalAdjuster.adjustQuery(from);

			// Filter here!
			filter(from, filters);

			List<ViewTableDatasets> result = setPaginationAndOrderBy(from)
				.fetch()
				.into(ViewTableDatasets.class);

			Set<Integer> acceptedLicenses = AuthenticationFilter.getAcceptedLicenses(req);

			result.forEach(d -> {
				Integer[] acceptedBy = d.getAcceptedBy();
				if (mode == AuthenticationMode.NONE)
				{
					// If there's no authentication, check if the license is in the cookie
					if (acceptedLicenses.contains(d.getLicenseId()))
					{
						acceptedBy = new Integer[1];
						acceptedBy[0] = userDetails.getId();
						d.setAcceptedBy(acceptedBy);
					}
					else
					{
						d.setAcceptedBy(new Integer[0]);
					}
				}
				else if (mode == AuthenticationMode.SELECTIVE)
				{
					if (userDetails.getId() == -1000)
					{
						// If we offer login, but the user hasn't logged in, check the cookie
						if (acceptedLicenses.contains(d.getLicenseId()))
						{
							acceptedBy = new Integer[1];
							acceptedBy[0] = userDetails.getId();
							d.setAcceptedBy(acceptedBy);
						}
						else
						{
							d.setAcceptedBy(new Integer[0]);
						}
					}
					else
					{
						if (!CollectionUtils.isEmpty(acceptedBy))
						{
							List<Integer> ids = Arrays.asList(acceptedBy);
							if (ids.contains(userDetails.getId()))
							{
								acceptedBy = new Integer[1];
								acceptedBy[0] = userDetails.getId();
								d.setAcceptedBy(acceptedBy);
							}
							else
							{
								// Else, clear this information
								d.setAcceptedBy(new Integer[0]);
							}
						}
						else
						{
							// Else, clear this information
							d.setAcceptedBy(new Integer[0]);
						}
					}
				}
				else
				{
					if (!CollectionUtils.isEmpty(acceptedBy))
					{
						List<Integer> ids = Arrays.asList(acceptedBy);
						if (ids.contains(userDetails.getId()))
						{
							acceptedBy = new Integer[1];
							acceptedBy[0] = userDetails.getId();
							d.setAcceptedBy(acceptedBy);
						}
						else
						{
							// Else, clear this information
							d.setAcceptedBy(new Integer[0]);
						}
					}
					else
					{
						// Else, clear this information
						d.setAcceptedBy(new Integer[0]);
					}
				}
			});

			long count = previousCount == -1 ? context.fetchOne("SELECT FOUND_ROWS()").into(Long.class) : previousCount;

			return new PaginatedResult<>(result, count);
		}
	}

	protected PaginatedResult<List<Integer>> runQuery(PaginatedRequest request)
		throws SQLException
	{
		AuthenticationFilter.UserDetails userDetails = (AuthenticationFilter.UserDetails) securityContext.getUserPrincipal();

		processRequest(request);
		currentPage = 0;
		pageSize = Integer.MAX_VALUE;
		try (Connection conn = Database.getConnection())
		{
			DSLContext context = Database.getContext(conn);
			SelectSelectStep<Record1<Integer>> select = context.selectDistinct(VIEW_TABLE_DATASETS.DATASET_ID);

			SelectJoinStep<Record1<Integer>> from = select.from(VIEW_TABLE_DATASETS);

			if (!userDetails.isAtLeast(UserType.ADMIN))
			{
				// Check if the dataset is public or if the user is part of a group that has access or if the user has access themselves
				from.where(VIEW_TABLE_DATASETS.DATASET_STATE.eq("public")
															.orExists(context.selectOne().from(DATASETPERMISSIONS)
																			 .leftJoin(USERGROUPS).on(USERGROUPS.ID.eq(DATASETPERMISSIONS.GROUP_ID))
																			 .leftJoin(USERGROUPMEMBERS).on(USERGROUPMEMBERS.USERGROUP_ID.eq(USERGROUPS.ID))
																			 .where(DATASETPERMISSIONS.DATASET_ID.eq(VIEW_TABLE_DATASETS.DATASET_ID))
																			 .and(USERGROUPMEMBERS.USER_ID.eq(userDetails.getId())
																										  .or(DATASETPERMISSIONS.USER_ID.eq(userDetails.getId())))));
			}

			// Filter here!
			filter(from, filters);

			List<Integer> result = setPaginationAndOrderBy(from)
				.fetch()
				.into(Integer.class);

			return new PaginatedResult<>(result, result.size());
		}
	}

	public interface AdjustQuery
	{
		void adjustQuery(SelectJoinStep<Record> query);
	}
}
