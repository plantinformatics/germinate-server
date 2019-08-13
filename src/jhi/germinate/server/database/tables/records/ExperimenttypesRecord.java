/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.*;

import javax.annotation.*;

import jhi.germinate.server.database.tables.*;


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
public class ExperimenttypesRecord extends UpdatableRecordImpl<ExperimenttypesRecord> implements Record4<Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1817074219;

    /**
     * Create a detached ExperimenttypesRecord
     */
    public ExperimenttypesRecord() {
        super(Experimenttypes.EXPERIMENTTYPES);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.experimenttypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.experimenttypes.description</code>. Describes the experiment type.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Create a detached, initialised ExperimenttypesRecord
     */
    public ExperimenttypesRecord(Integer id, String description, Timestamp createdOn, Timestamp updatedOn) {
        super(Experimenttypes.EXPERIMENTTYPES);

        set(0, id);
        set(1, description);
        set(2, createdOn);
        set(3, updatedOn);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.experimenttypes.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.experimenttypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.experimenttypes.description</code>. Describes the experiment type.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.experimenttypes.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(2);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Experimenttypes.EXPERIMENTTYPES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Experimenttypes.EXPERIMENTTYPES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Experimenttypes.EXPERIMENTTYPES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Experimenttypes.EXPERIMENTTYPES.UPDATED_ON;
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
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
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
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimenttypesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimenttypesRecord value2(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimenttypesRecord value3(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimenttypesRecord value4(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimenttypesRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>germinate_template_3_7_0.experimenttypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.experimenttypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(3, value);
    }
}
