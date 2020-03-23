/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.annotation.Generated;

import jhi.germinate.resource.ImportResult;
import jhi.germinate.server.database.enums.DataImportJobsDatatype;
import jhi.germinate.server.database.enums.DataImportJobsStatus;


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
public class DataImportJobs implements Serializable {

    private static final long serialVersionUID = 1607182583;

    private Integer                id;
    private String                 uuid;
    private String                 jobId;
    private Integer                userId;
    private String                 originalFilename;
    private Boolean                isUpdate;
    private DataImportJobsDatatype datatype;
    private DataImportJobsStatus   status;
    private Boolean                imported;
    private Boolean                visibility;
    private ImportResult[]         feedback;
    private Timestamp              createdOn;
    private Timestamp              updatedOn;

    public DataImportJobs() {}

    public DataImportJobs(DataImportJobs value) {
        this.id = value.id;
        this.uuid = value.uuid;
        this.jobId = value.jobId;
        this.userId = value.userId;
        this.originalFilename = value.originalFilename;
        this.isUpdate = value.isUpdate;
        this.datatype = value.datatype;
        this.status = value.status;
        this.imported = value.imported;
        this.visibility = value.visibility;
        this.feedback = value.feedback;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public DataImportJobs(
        Integer                id,
        String                 uuid,
        String                 jobId,
        Integer                userId,
        String                 originalFilename,
        Boolean                isUpdate,
        DataImportJobsDatatype datatype,
        DataImportJobsStatus   status,
        Boolean                imported,
        Boolean                visibility,
        ImportResult[]         feedback,
        Timestamp              createdOn,
        Timestamp              updatedOn
    ) {
        this.id = id;
        this.uuid = uuid;
        this.jobId = jobId;
        this.userId = userId;
        this.originalFilename = originalFilename;
        this.isUpdate = isUpdate;
        this.datatype = datatype;
        this.status = status;
        this.imported = imported;
        this.visibility = visibility;
        this.feedback = feedback;
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

    public String getOriginalFilename() {
        return this.originalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    public Boolean getIsUpdate() {
        return this.isUpdate;
    }

    public void setIsUpdate(Boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

    public DataImportJobsDatatype getDatatype() {
        return this.datatype;
    }

    public void setDatatype(DataImportJobsDatatype datatype) {
        this.datatype = datatype;
    }

    public DataImportJobsStatus getStatus() {
        return this.status;
    }

    public void setStatus(DataImportJobsStatus status) {
        this.status = status;
    }

    public Boolean getImported() {
        return this.imported;
    }

    public void setImported(Boolean imported) {
        this.imported = imported;
    }

    public Boolean getVisibility() {
        return this.visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public ImportResult[] getFeedback() {
        return this.feedback;
    }

    public void setFeedback(ImportResult... feedback) {
        this.feedback = feedback;
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
        StringBuilder sb = new StringBuilder("DataImportJobs (");

        sb.append(id);
        sb.append(", ").append(uuid);
        sb.append(", ").append(jobId);
        sb.append(", ").append(userId);
        sb.append(", ").append(originalFilename);
        sb.append(", ").append(isUpdate);
        sb.append(", ").append(datatype);
        sb.append(", ").append(status);
        sb.append(", ").append(imported);
        sb.append(", ").append(visibility);
        sb.append(", ").append(Arrays.toString(feedback));
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}