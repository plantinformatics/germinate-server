/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.Megaenvironmentdata;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Describes mega environment data by grouping collection sites (locations) 
 * into mega environments. Mega environments in this context are collections 
 * of sites which meet the mega environment definition criteria.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MegaenvironmentdataRecord extends UpdatableRecordImpl<MegaenvironmentdataRecord> implements Record7<Integer, Integer, Integer, Integer, Boolean, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1746698004;

    /**
     * Create a detached MegaenvironmentdataRecord
     */
    public MegaenvironmentdataRecord() {
        super(Megaenvironmentdata.MEGAENVIRONMENTDATA);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironmentdata.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised MegaenvironmentdataRecord
     */
    public MegaenvironmentdataRecord(Integer id, Integer locationId, Integer sourceId, Integer megaenvironmentId, Boolean isFinal, Timestamp createdOn, Timestamp updatedOn) {
        super(Megaenvironmentdata.MEGAENVIRONMENTDATA);

        set(0, id);
        set(1, locationId);
        set(2, sourceId);
        set(3, megaenvironmentId);
        set(4, isFinal);
        set(5, createdOn);
        set(6, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironmentdata.location_id</code>. Foreign key to locations (locations.id).
     */
    public Integer getLocationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironmentdata.source_id</code>. Source ID
     */
    public void setSourceId(Integer value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironmentdata.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironmentdata.megaenvironment_id</code>. Foreign key to megaenvironments (megaenvironments.id).
     */
    public void setMegaenvironmentId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironmentdata.megaenvironment_id</code>. Foreign key to megaenvironments (megaenvironments.id).
     */
    public Integer getMegaenvironmentId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironmentdata.location_id</code>. Foreign key to locations (locations.id).
     */
    public void setLocationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironmentdata.source_id</code>. Source ID
     */
    public Integer getSourceId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironmentdata.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironmentdata.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(5);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironmentdata.is_final</code>. The source that was used to determine the megaenvironment data.
     */
    public Boolean getIsFinal() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironmentdata.is_final</code>. The source that was used to determine the megaenvironment data.
     */
    public void setIsFinal(Boolean value) {
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironmentdata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironmentdata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Megaenvironmentdata.MEGAENVIRONMENTDATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Megaenvironmentdata.MEGAENVIRONMENTDATA.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Megaenvironmentdata.MEGAENVIRONMENTDATA.SOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Megaenvironmentdata.MEGAENVIRONMENTDATA.MEGAENVIRONMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Boolean, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Megaenvironmentdata.MEGAENVIRONMENTDATA.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Megaenvironmentdata.MEGAENVIRONMENTDATA.UPDATED_ON;
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
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getMegaenvironmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Boolean, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
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
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getMegaenvironmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Megaenvironmentdata.MEGAENVIRONMENTDATA.IS_FINAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentdataRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentdataRecord value2(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentdataRecord value3(Integer value) {
        setSourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentdataRecord value4(Integer value) {
        setMegaenvironmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getIsFinal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentdataRecord value6(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentdataRecord value7(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentdataRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Boolean value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
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
        return getIsFinal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentdataRecord value5(Boolean value) {
        setIsFinal(value);
        return this;
    }
// @formatter:on
}
