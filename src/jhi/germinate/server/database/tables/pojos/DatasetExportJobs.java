/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import com.google.gson.JsonArray;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.enums.DatasetExportJobsStatus;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatasetExportJobs implements Serializable {

    private static final long serialVersionUID = -1992491636;

    private Integer                 id;
    private String                  uuid;
    private String                  jobId;
    private Integer                 userId;
    private DatasetExportJobsStatus status;
    private Boolean                 visibility;
    private Integer                 experimentTypeId;
    private JsonArray               datasetIds;
    private Timestamp               createdOn;
    private Timestamp               updatedOn;

    public DatasetExportJobs() {}

    public DatasetExportJobs(DatasetExportJobs value) {
        this.id = value.id;
        this.uuid = value.uuid;
        this.jobId = value.jobId;
        this.userId = value.userId;
        this.status = value.status;
        this.visibility = value.visibility;
        this.experimentTypeId = value.experimentTypeId;
        this.datasetIds = value.datasetIds;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public DatasetExportJobs(
        Integer                 id,
        String                  uuid,
        String                  jobId,
        Integer                 userId,
        DatasetExportJobsStatus status,
        Boolean                 visibility,
        Integer                 experimentTypeId,
        JsonArray               datasetIds,
        Timestamp               createdOn,
        Timestamp               updatedOn
    ) {
        this.id = id;
        this.uuid = uuid;
        this.jobId = jobId;
        this.userId = userId;
        this.status = status;
        this.visibility = visibility;
        this.experimentTypeId = experimentTypeId;
        this.datasetIds = datasetIds;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public DatasetExportJobsStatus getStatus() {
        return this.status;
    }

    public void setStatus(DatasetExportJobsStatus status) {
        this.status = status;
    }

    public Boolean getVisibility() {
        return this.visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public Integer getExperimentTypeId() {
        return this.experimentTypeId;
    }

    public void setExperimentTypeId(Integer experimentTypeId) {
        this.experimentTypeId = experimentTypeId;
    }

    public JsonArray getDatasetIds() {
        return this.datasetIds;
    }

    public void setDatasetIds(JsonArray datasetIds) {
        this.datasetIds = datasetIds;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DatasetExportJobs (");

        sb.append(id);
        sb.append(", ").append(uuid);
        sb.append(", ").append(jobId);
        sb.append(", ").append(userId);
        sb.append(", ").append(status);
        sb.append(", ").append(visibility);
        sb.append(", ").append(experimentTypeId);
        sb.append(", ").append(datasetIds);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
