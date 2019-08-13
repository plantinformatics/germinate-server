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
 * The link type determines which database table and column are used to construct 
 * the final
 * link. The ”placeholder” in the link (from the links table) will be replaced 
 * by the value of the
 * ”target column” in the ”target table”
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Linktypes extends TableImpl<LinktypesRecord> {

    private static final long serialVersionUID = 1217469456;

    /**
     * The reference instance of <code>germinate_template_3_7_0.linktypes</code>
     */
    public static final Linktypes LINKTYPES = new Linktypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LinktypesRecord> getRecordType() {
        return LinktypesRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.linktypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<LinktypesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.linktypes.description</code>. A description of the link
.
     */
    public final TableField<LinktypesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A description of the link\r.");

    /**
     * The column <code>germinate_template_3_7_0.linktypes.target_table</code>. This is the table that the link links to.
     */
    public final TableField<LinktypesRecord, String> TARGET_TABLE = createField("target_table", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "This is the table that the link links to.");

    /**
     * The column <code>germinate_template_3_7_0.linktypes.target_column</code>. This is the column that is used to generate the link.
     */
    public final TableField<LinktypesRecord, String> TARGET_COLUMN = createField("target_column", org.jooq.impl.SQLDataType.VARCHAR(255), this, "This is the column that is used to generate the link.");

    /**
     * The column <code>germinate_template_3_7_0.linktypes.placeholder</code>. The part of the link that will be replaced by the value of the target column.
     */
    public final TableField<LinktypesRecord, String> PLACEHOLDER = createField("placeholder", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The part of the link that will be replaced by the value of the target column.");

    /**
     * The column <code>germinate_template_3_7_0.linktypes.created_on</code>. When the record was created.
     */
    public final TableField<LinktypesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.linktypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<LinktypesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.linktypes</code> table reference
     */
    public Linktypes() {
        this(DSL.name("linktypes"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.linktypes</code> table reference
     */
    public Linktypes(String alias) {
        this(DSL.name(alias), LINKTYPES);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.linktypes</code> table reference
     */
    public Linktypes(Name alias) {
        this(alias, LINKTYPES);
    }

    private Linktypes(Name alias, Table<LinktypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Linktypes(Name alias, Table<LinktypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("The link type determines which database table and column are used to construct the final\r\nlink. The ”placeholder” in the link (from the links table) will be replaced by the value of the\r\n”target column” in the ”target table”"));
    }

    public <O extends Record> Linktypes(Table<O> child, ForeignKey<O, LinktypesRecord> key) {
        super(child, key, LINKTYPES);
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
        return Arrays.<Index>asList(Indexes.LINKTYPES_LINKTYPES_ID, Indexes.LINKTYPES_LINKTYPES_TARGET_TABLE, Indexes.LINKTYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LinktypesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LINKTYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LinktypesRecord> getPrimaryKey() {
        return Keys.KEY_LINKTYPES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LinktypesRecord>> getKeys() {
        return Arrays.<UniqueKey<LinktypesRecord>>asList(Keys.KEY_LINKTYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Linktypes as(String alias) {
        return new Linktypes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Linktypes as(Name alias) {
        return new Linktypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Linktypes rename(String name) {
        return new Linktypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Linktypes rename(Name name) {
        return new Linktypes(name, null);
    }
}
