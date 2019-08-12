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
 * The 'units' table holds descriptions of the various units that are used 
 * in the Germinate database. Examples of these would include International 
 * System of Units (SI) base units: kilogram, meter, second, ampere, kelvin, 
 * candela and mole but can include any units that are required.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UnitsRecord extends UpdatableRecordImpl<UnitsRecord> implements Record6<Integer, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1915668705;

    /**
     * Create a detached UnitsRecord
     */
    public UnitsRecord() {
        super(Units.UNITS);
    }

    /**
     * Create a detached, initialised UnitsRecord
     */
    public UnitsRecord(Integer id, String unitName, String unitAbbreviation, String unitDescription, Timestamp createdOn, Timestamp updatedOn) {
        super(Units.UNITS);

        set(0, id);
        set(1, unitName);
        set(2, unitAbbreviation);
        set(3, unitDescription);
        set(4, createdOn);
        set(5, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.units.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.units.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.units.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public String getUnitName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.units.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public void setUnitName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.units.unit_abbreviation</code>. This should be the unit abbreviation.
     */
    public String getUnitAbbreviation() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.units.unit_abbreviation</code>. This should be the unit abbreviation.
     */
    public void setUnitAbbreviation(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.units.unit_description</code>. A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.
     */
    public String getUnitDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.units.unit_description</code>. A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.
     */
    public void setUnitDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.units.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.units.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Units.UNITS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Units.UNITS.UNIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Units.UNITS.UNIT_ABBREVIATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Units.UNITS.UNIT_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Units.UNITS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Units.UNITS.UPDATED_ON;
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
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUnitAbbreviation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUnitDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUnitAbbreviation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUnitDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnitsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnitsRecord value2(String value) {
        setUnitName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnitsRecord value3(String value) {
        setUnitAbbreviation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnitsRecord value4(String value) {
        setUnitDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnitsRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnitsRecord value6(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UnitsRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>germinate_template_3_7_0.units.updated_on</code>. When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.units.updated_on</code>. When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(5, value);
    }
}
