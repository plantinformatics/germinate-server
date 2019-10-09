package jhi.germinate.resource;

/**
 * @author Sebastian Raubach
 */
public class AsyncExportResult
{
	private String status;
	private String uuid;

	public String getStatus()
	{
		return status;
	}

	public AsyncExportResult setStatus(String status)
	{
		this.status = status;
		return this;
	}

	public String getUuid()
	{
		return uuid;
	}

	public AsyncExportResult setUuid(String uuid)
	{
		this.uuid = uuid;
		return this;
	}
}
