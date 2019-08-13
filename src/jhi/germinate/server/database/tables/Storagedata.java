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
public class Storagedata extends TableImpl<StoragedataRecord> {

    private static final long serialVersionUID = -370276838;

    /**
     * The reference instance of <code>germinate_template_3_7_0.storagedata</code>
     */
    public static final Storagedata STORAGEDATA = new Storagedata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoragedataRecord> getRecordType() {
        return StoragedataRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.storagedata.id</code>.
     */
    public final TableField<StoragedataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_template_3_7_0.storagedata.germinatebase_id</code>.
     */
    public final TableField<StoragedataRecord, Integer> GERMINATEBASE_ID = createField("germinatebase_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.storagedata.storage_id</code>.
     */
    public final TableField<StoragedataRecord, Integer> STORAGE_ID = createField("storage_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.storagedata.created_on</code>. When the record was created.
     */
    public final TableField<StoragedataRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.storagedata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<StoragedataRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.storagedata</code> table reference
     */
    public Storagedata() {
        this(DSL.name("storagedata"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.storagedata</code> table reference
     */
    public Storagedata(String alias) {
        this(DSL.name(alias), STORAGEDATA);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.storagedata</code> table reference
     */
    public Storagedata(Name alias) {
        this(alias, STORAGEDATA);
    }

    private Storagedata(Name alias, Table<StoragedataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Storagedata(Name alias, Table<StoragedataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Storagedata(Table<O> child, ForeignKey<O, StoragedataRecord> key) {
        super(child, key, STORAGEDATA);
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
        return Arrays.<Index>asList(Indexes.STORAGEDATA_GERMINATEBASE_ID, Indexes.STORAGEDATA_PRIMARY, Indexes.STORAGEDATA_STORAGE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StoragedataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STORAGEDATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StoragedataRecord> getPrimaryKey() {
        return Keys.KEY_STORAGEDATA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StoragedataRecord>> getKeys() {
        return Arrays.<UniqueKey<StoragedataRecord>>asList(Keys.KEY_STORAGEDATA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StoragedataRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StoragedataRecord, ?>>asList(Keys.STORAGEDATA_IBFK_1, Keys.STORAGEDATA_IBFK_2);
    }

    public Germinatebase germinatebase() {
        return new Germinatebase(this, Keys.STORAGEDATA_IBFK_1);
    }

    public Storage storage() {
        return new Storage(this, Keys.STORAGEDATA_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Storagedata as(String alias) {
        return new Storagedata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Storagedata as(Name alias) {
        return new Storagedata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Storagedata rename(String name) {
        return new Storagedata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Storagedata rename(Name name) {
        return new Storagedata(name, null);
    }
}
