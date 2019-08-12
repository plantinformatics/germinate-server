/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.*;

import javax.annotation.*;

import jhi.germinate.server.database.enums.*;
import jhi.germinate.server.database.tables.*;


/**
 * Defines climates. Climates are measureable weather type characteristics 
 * such as temperature or cloud cover.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClimatesRecord extends UpdatableRecordImpl<ClimatesRecord> implements Record8<Integer, String, String, String, ClimatesDatatype, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 733095351;

    /**
     * Create a detached ClimatesRecord
     */
    public ClimatesRecord() {
        super(Climates.CLIMATES);
    }

    /**
     * Create a detached, initialised ClimatesRecord
     */
    public ClimatesRecord(Integer id, String name, String shortName, String description, ClimatesDatatype datatype, Integer unitId, Timestamp createdOn, Timestamp updatedOn) {
        super(Climates.CLIMATES);

        set(0, id);
        set(1, name);
        set(2, shortName);
        set(3, description);
        set(4, datatype);
        set(5, unitId);
        set(6, createdOn);
        set(7, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climates.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climates.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climates.name</code>. Describes the climate.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climates.name</code>. Describes the climate.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climates.short_name</code>. Shortened version of the climate name which is used in some table headers.
     */
    public String getShortName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climates.short_name</code>. Shortened version of the climate name which is used in some table headers.
     */
    public void setShortName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climates.description</code>. A longer description of the climate.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climates.description</code>. A longer description of the climate.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climates.datatype</code>. Defines the datatype which can be FLOAT, INT or CHAR type.
     */
    public ClimatesDatatype getDatatype() {
        return (ClimatesDatatype) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climates.datatype</code>. Defines the datatype which can be FLOAT, INT or CHAR type.
     */
    public void setDatatype(ClimatesDatatype value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climates.unit_id</code>. Foreign key to units (units.id).

     */
    public Integer getUnitId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climates.unit_id</code>. Foreign key to units (units.id).

     */
    public void setUnitId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climates.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climates.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
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
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, ClimatesDatatype, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, String, ClimatesDatatype, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Climates.CLIMATES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Climates.CLIMATES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Climates.CLIMATES.SHORT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Climates.CLIMATES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ClimatesDatatype> field5() {
        return Climates.CLIMATES.DATATYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Climates.CLIMATES.UNIT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Climates.CLIMATES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Climates.CLIMATES.UPDATED_ON;
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
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getShortName();
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
    public ClimatesDatatype component5() {
        return getDatatype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getUnitId();
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getShortName();
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
    public ClimatesDatatype value5() {
        return getDatatype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getUnitId();
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
    public ClimatesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatesRecord value3(String value) {
        setShortName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatesRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatesRecord value5(ClimatesDatatype value) {
        setDatatype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatesRecord value6(Integer value) {
        setUnitId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatesRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatesRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatesRecord values(Integer value1, String value2, String value3, String value4, ClimatesDatatype value5, Integer value6, Timestamp value7, Timestamp value8) {
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
     * Getter for <code>germinate_template_3_7_0.climates.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climates.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }
}
