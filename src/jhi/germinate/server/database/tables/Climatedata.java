/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.*;
import java.util.*;

import javax.annotation.*;

import jhi.germinate.server.database.*;
import jhi.germinate.server.database.tables.records.*;


/**
 * Holds montly average climate data such as rainfall, temperature or cloud 
 * cover. This is based on locations rather than accessions like most of the 
 * other tables in Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Climatedata extends TableImpl<ClimatedataRecord> {

    private static final long serialVersionUID = -2078874218;

    /**
     * The reference instance of <code>germinate_template_3_7_0.climatedata</code>
     */
    public static final Climatedata CLIMATEDATA = new Climatedata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClimatedataRecord> getRecordType() {
        return ClimatedataRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.climatedata.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ClimatedataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.climatedata.climate_id</code>. Foreign key to climates (climates.id).
     */
    public final TableField<ClimatedataRecord, Integer> CLIMATE_ID = createField("climate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Foreign key to climates (climates.id).");

    /**
     * The column <code>germinate_template_3_7_0.climatedata.location_id</code>. Foreign key to locations (locations.id).
     */
    public final TableField<ClimatedataRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Foreign key to locations (locations.id).");

    /**
     * The column <code>germinate_template_3_7_0.climatedata.climate_value</code>. Value for the specific climate attribute. These are monthly averages and not daily. Monthly data is required for the current Germinate climate viisualizations and interface.
     */
    public final TableField<ClimatedataRecord, Double> CLIMATE_VALUE = createField("climate_value", org.jooq.impl.SQLDataType.DOUBLE, this, "Value for the specific climate attribute. These are monthly averages and not daily. Monthly data is required for the current Germinate climate viisualizations and interface.");

    /**
     * The column <code>germinate_template_3_7_0.climatedata.dataset_id</code>. Foreign key to datasets (datasets.id).
     */
    public final TableField<ClimatedataRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key to datasets (datasets.id).");

    /**
     * The column <code>germinate_template_3_7_0.climatedata.recording_date</code>. The month that the data was recorded. This uses an integer to represent the month (1-12).
     */
    public final TableField<ClimatedataRecord, String> RECORDING_DATE = createField("recording_date", org.jooq.impl.SQLDataType.VARCHAR(32), this, "The month that the data was recorded. This uses an integer to represent the month (1-12).");

    /**
     * The column <code>germinate_template_3_7_0.climatedata.created_on</code>. When the record was created.
     */
    public final TableField<ClimatedataRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.climatedata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<ClimatedataRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.climatedata</code> table reference
     */
    public Climatedata() {
        this(DSL.name("climatedata"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.climatedata</code> table reference
     */
    public Climatedata(String alias) {
        this(DSL.name(alias), CLIMATEDATA);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.climatedata</code> table reference
     */
    public Climatedata(Name alias) {
        this(alias, CLIMATEDATA);
    }

    private Climatedata(Name alias, Table<ClimatedataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Climatedata(Name alias, Table<ClimatedataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Holds montly average climate data such as rainfall, temperature or cloud cover. This is based on locations rather than accessions like most of the other tables in Germinate."));
    }

    public <O extends Record> Climatedata(Table<O> child, ForeignKey<O, ClimatedataRecord> key) {
        super(child, key, CLIMATEDATA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateTemplate_3_7_0.GERMINATE_TEMPLATE_3_7_0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CLIMATEDATA_CLIMATE_ID, Indexes.CLIMATEDATA_CLIMATE_LOCATION_ID, Indexes.CLIMATEDATA_DATASET_ID, Indexes.CLIMATEDATA_LOCATION_ID, Indexes.CLIMATEDATA_PRIMARY, Indexes.CLIMATEDATA_RECORDING_DATE_CLIMATE_CALUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ClimatedataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLIMATEDATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClimatedataRecord> getPrimaryKey() {
        return Keys.KEY_CLIMATEDATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClimatedataRecord>> getKeys() {
        return Arrays.<UniqueKey<ClimatedataRecord>>asList(Keys.KEY_CLIMATEDATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ClimatedataRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClimatedataRecord, ?>>asList(Keys.CLIMATEDATA_IBFK_2, Keys.CLIMATEDATA_IBFK_3, Keys.CLIMATEDATA_IBFK_1);
    }

    public Climates climates() {
        return new Climates(this, Keys.CLIMATEDATA_IBFK_2);
    }

    public Locations locations() {
        return new Locations(this, Keys.CLIMATEDATA_IBFK_3);
    }

    public Datasets datasets() {
        return new Datasets(this, Keys.CLIMATEDATA_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Climatedata as(String alias) {
        return new Climatedata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Climatedata as(Name alias) {
        return new Climatedata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Climatedata rename(String name) {
        return new Climatedata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Climatedata rename(Name name) {
        return new Climatedata(name, null);
    }
}
