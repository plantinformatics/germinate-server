/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.math.*;
import java.sql.*;
import java.util.*;

import javax.annotation.*;

import jhi.germinate.server.database.*;
import jhi.germinate.server.database.tables.records.*;


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
public class Compounddata extends TableImpl<CompounddataRecord> {

    private static final long serialVersionUID = 2046932616;

    /**
     * The reference instance of <code>germinate_template_3_7_0.compounddata</code>
     */
    public static final Compounddata COMPOUNDDATA = new Compounddata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompounddataRecord> getRecordType() {
        return CompounddataRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.compounddata.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<CompounddataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.compounddata.compound_id</code>. Foreign key compounds (compounds.id).
     */
    public final TableField<CompounddataRecord, Integer> COMPOUND_ID = createField("compound_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key compounds (compounds.id).");

    /**
     * The column <code>germinate_template_3_7_0.compounddata.germinatebase_id</code>. Foreign key germinatebase (germinatebase.id).
     */
    public final TableField<CompounddataRecord, Integer> GERMINATEBASE_ID = createField("germinatebase_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key germinatebase (germinatebase.id).");

    /**
     * The column <code>germinate_template_3_7_0.compounddata.dataset_id</code>. Foreign key datasets (datasets.id).
     */
    public final TableField<CompounddataRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key datasets (datasets.id).");

    /**
     * The column <code>germinate_template_3_7_0.compounddata.analysismethod_id</code>. Foreign key analysismethods (analysismethods.id).
     */
    public final TableField<CompounddataRecord, Integer> ANALYSISMETHOD_ID = createField("analysismethod_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key analysismethods (analysismethods.id).");

    /**
     * The column <code>germinate_template_3_7_0.compounddata.compound_value</code>. The compound value for this compound_id and germinatebase_id combination.
     */
    public final TableField<CompounddataRecord, BigDecimal> COMPOUND_VALUE = createField("compound_value", org.jooq.impl.SQLDataType.DECIMAL(64, 10).nullable(false), this, "The compound value for this compound_id and germinatebase_id combination.");

    /**
     * The column <code>germinate_template_3_7_0.compounddata.recording_date</code>. Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public final TableField<CompounddataRecord, Timestamp> RECORDING_DATE = createField("recording_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.");

    /**
     * The column <code>germinate_template_3_7_0.compounddata.created_on</code>. When the record was created.
     */
    public final TableField<CompounddataRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.compounddata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<CompounddataRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.compounddata</code> table reference
     */
    public Compounddata() {
        this(DSL.name("compounddata"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.compounddata</code> table reference
     */
    public Compounddata(String alias) {
        this(DSL.name(alias), COMPOUNDDATA);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.compounddata</code> table reference
     */
    public Compounddata(Name alias) {
        this(alias, COMPOUNDDATA);
    }

    private Compounddata(Name alias, Table<CompounddataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Compounddata(Name alias, Table<CompounddataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Compounddata(Table<O> child, ForeignKey<O, CompounddataRecord> key) {
        super(child, key, COMPOUNDDATA);
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
        return Arrays.<Index>asList(Indexes.COMPOUNDDATA_COMPOUNDDATA_IBFK_ANALYSISMETHOD, Indexes.COMPOUNDDATA_COMPOUNDDATA_IBFK_COMPOUND, Indexes.COMPOUNDDATA_COMPOUNDDATA_IBFK_DATASET, Indexes.COMPOUNDDATA_COMPOUNDDATA_IBFK_GERMINATEBASE, Indexes.COMPOUNDDATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CompounddataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMPOUNDDATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CompounddataRecord> getPrimaryKey() {
        return Keys.KEY_COMPOUNDDATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompounddataRecord>> getKeys() {
        return Arrays.<UniqueKey<CompounddataRecord>>asList(Keys.KEY_COMPOUNDDATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CompounddataRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CompounddataRecord, ?>>asList(Keys.COMPOUNDDATA_IBFK_2, Keys.COMPOUNDDATA_IBFK_4, Keys.COMPOUNDDATA_IBFK_3, Keys.COMPOUNDDATA_IBFK_1);
    }

    public Compounds compounds() {
        return new Compounds(this, Keys.COMPOUNDDATA_IBFK_2);
    }

    public Germinatebase germinatebase() {
        return new Germinatebase(this, Keys.COMPOUNDDATA_IBFK_4);
    }

    public Datasets datasets() {
        return new Datasets(this, Keys.COMPOUNDDATA_IBFK_3);
    }

    public Analysismethods analysismethods() {
        return new Analysismethods(this, Keys.COMPOUNDDATA_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Compounddata as(String alias) {
        return new Compounddata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Compounddata as(Name alias) {
        return new Compounddata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Compounddata rename(String name) {
        return new Compounddata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Compounddata rename(Name name) {
        return new Compounddata(name, null);
    }
}
