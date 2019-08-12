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
 * Contains information relating to the source of the mega environments. This 
 * could be the contributing source including contact and location details 
 * or how the mega environments were extracted from current datasets. 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Megaenvironmentsource extends TableImpl<MegaenvironmentsourceRecord> {

    /**
     * The reference instance of <code>germinate_template_3_7_0.megaenvironmentsource</code>
     */
    public static final Megaenvironmentsource MEGAENVIRONMENTSOURCE = new Megaenvironmentsource();
    private static final long serialVersionUID = -1410445817;

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MegaenvironmentsourceRecord> getRecordType() {
        return MegaenvironmentsourceRecord.class;
    }
    /**
     * The column <code>germinate_template_3_7_0.megaenvironmentsource.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<MegaenvironmentsourceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.megaenvironmentsource.name</code>. The name of the mega environment source.
     */
    public final TableField<MegaenvironmentsourceRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "The name of the mega environment source.");

    /**
     * The column <code>germinate_template_3_7_0.megaenvironmentsource.description</code>. Describes the mega environment source.
     */
    public final TableField<MegaenvironmentsourceRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "Describes the mega environment source.");

    /**
     * The column <code>germinate_template_3_7_0.megaenvironmentsource.created_on</code>. When the record was created.
     */
    public final TableField<MegaenvironmentsourceRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.megaenvironmentsource.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<MegaenvironmentsourceRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.megaenvironmentsource</code> table reference
     */
    public Megaenvironmentsource() {
        this(DSL.name("megaenvironmentsource"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.megaenvironmentsource</code> table reference
     */
    public Megaenvironmentsource(String alias) {
        this(DSL.name(alias), MEGAENVIRONMENTSOURCE);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.megaenvironmentsource</code> table reference
     */
    public Megaenvironmentsource(Name alias) {
        this(alias, MEGAENVIRONMENTSOURCE);
    }

    private Megaenvironmentsource(Name alias, Table<MegaenvironmentsourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Megaenvironmentsource(Name alias, Table<MegaenvironmentsourceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Contains information relating to the source of the mega environments. This could be the contributing source including contact and location details or how the mega environments were extracted from current datasets. "));
    }

    public <O extends Record> Megaenvironmentsource(Table<O> child, ForeignKey<O, MegaenvironmentsourceRecord> key) {
        super(child, key, MEGAENVIRONMENTSOURCE);
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
        return Arrays.<Index>asList(Indexes.MEGAENVIRONMENTSOURCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MegaenvironmentsourceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MEGAENVIRONMENTSOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MegaenvironmentsourceRecord> getPrimaryKey() {
        return Keys.KEY_MEGAENVIRONMENTSOURCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MegaenvironmentsourceRecord>> getKeys() {
        return Arrays.<UniqueKey<MegaenvironmentsourceRecord>>asList(Keys.KEY_MEGAENVIRONMENTSOURCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Megaenvironmentsource as(String alias) {
        return new Megaenvironmentsource(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Megaenvironmentsource as(Name alias) {
        return new Megaenvironmentsource(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Megaenvironmentsource rename(String name) {
        return new Megaenvironmentsource(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Megaenvironmentsource rename(Name name) {
        return new Megaenvironmentsource(name, null);
    }
}
