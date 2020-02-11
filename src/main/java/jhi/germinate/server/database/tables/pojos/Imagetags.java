/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Imagetags implements Serializable {

    private static final long serialVersionUID = 806311967;

    private Integer   id;
    private String    tagName;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Imagetags() {}

    public Imagetags(Imagetags value) {
        this.id = value.id;
        this.tagName = value.tagName;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Imagetags(
        Integer   id,
        String    tagName,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.tagName = tagName;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
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
        StringBuilder sb = new StringBuilder("Imagetags (");

        sb.append(id);
        sb.append(", ").append(tagName);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}