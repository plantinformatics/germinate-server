/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.Groups;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Allows the definition of groups within Germinate. Germinate supports a 
 * number of different group types such as germinatebase accesion groups and 
 * marker groups.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupsRecord extends UpdatableRecordImpl<GroupsRecord> implements Record8<Integer, Integer, String, String, Boolean, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -902814846;

    /**
     * Create a detached GroupsRecord
     */
    public GroupsRecord() {
        super(Groups.GROUPS);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.groups.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised GroupsRecord
     */
    public GroupsRecord(Integer id, Integer grouptypeId, String name, String description, Boolean visibility, Integer createdBy, Timestamp createdOn, Timestamp updatedOn) {
        super(Groups.GROUPS);

        set(0, id);
        set(1, grouptypeId);
        set(2, name);
        set(3, description);
        set(4, visibility);
        set(5, createdBy);
        set(6, createdOn);
        set(7, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.groups.grouptype_id</code>. Foreign key to grouptypes (grouptypes.id).
     */
    public Integer getGrouptypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.groups.name</code>. The name of the group which can be used to identify it.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.groups.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.groups.description</code>. A free text description of the group. This has no length limitations.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.groups.description</code>. A free text description of the group. This has no length limitations.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.groups.grouptype_id</code>. Foreign key to grouptypes (grouptypes.id).
     */
    public void setGrouptypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.groups.name</code>. The name of the group which can be used to identify it.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.groups.created_by</code>. Defines who created the group. Foreign key to Gatekeeper users (Gatekeeper users.id).
     */
    public void setCreatedBy(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.groups.visibility</code>. Defines if the group is visuble or hidden from the Germinate user interface.
     */
    public Boolean getVisibility() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.groups.created_on</code>. Foreign key to locations (locations.id).
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.groups.created_on</code>. Foreign key to locations (locations.id).
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.groups.visibility</code>. Defines if the group is visuble or hidden from the Germinate user interface.
     */
    public void setVisibility(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.groups.created_by</code>. Defines who created the group. Foreign key to Gatekeeper users (Gatekeeper users.id).
     */
    public Integer getCreatedBy() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>germinate_template_3_7_0.groups.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.groups.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Groups.GROUPS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Groups.GROUPS.GROUPTYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Groups.GROUPS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Groups.GROUPS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, Boolean, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Groups.GROUPS.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Groups.GROUPS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Groups.GROUPS.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getGrouptypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, Boolean, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getGrouptypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Groups.GROUPS.VISIBILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupsRecord value2(Integer value) {
        setGrouptypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupsRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupsRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupsRecord value6(Integer value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupsRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupsRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupsRecord values(Integer value1, Integer value2, String value3, String value4, Boolean value5, Integer value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GroupsRecord value5(Boolean value) {
        setVisibility(value);
        return this;
    }
// @formatter:on
}
