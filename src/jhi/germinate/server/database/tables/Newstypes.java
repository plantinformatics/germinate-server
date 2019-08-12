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
 * Defines the news types which are contained the database. The news types 
 * are displayed on the Germinate user interface and are not required if the 
 * user interface is not used.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Newstypes extends TableImpl<NewstypesRecord> {

    /**
     * The reference instance of <code>germinate_template_3_7_0.newstypes</code>
     */
    public static final Newstypes NEWSTYPES = new Newstypes();
    private static final long serialVersionUID = 143843316;

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NewstypesRecord> getRecordType() {
        return NewstypesRecord.class;
    }
    /**
     * The column <code>germinate_template_3_7_0.newstypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<NewstypesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.newstypes.name</code>. Name of the news type.
     */
    public final TableField<NewstypesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Name of the news type.");

    /**
     * The column <code>germinate_template_3_7_0.newstypes.description</code>. A longer description of the news type.
     */
    public final TableField<NewstypesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A longer description of the news type.");

    /**
     * The column <code>germinate_template_3_7_0.newstypes.created_on</code>. When the record was created.
     */
    public final TableField<NewstypesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.newstypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<NewstypesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.newstypes</code> table reference
     */
    public Newstypes() {
        this(DSL.name("newstypes"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.newstypes</code> table reference
     */
    public Newstypes(String alias) {
        this(DSL.name(alias), NEWSTYPES);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.newstypes</code> table reference
     */
    public Newstypes(Name alias) {
        this(alias, NEWSTYPES);
    }

    private Newstypes(Name alias, Table<NewstypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Newstypes(Name alias, Table<NewstypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines the news types which are contained the database. The news types are displayed on the Germinate user interface and are not required if the user interface is not used."));
    }

    public <O extends Record> Newstypes(Table<O> child, ForeignKey<O, NewstypesRecord> key) {
        super(child, key, NEWSTYPES);
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
        return Arrays.<Index>asList(Indexes.NEWSTYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<NewstypesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_NEWSTYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NewstypesRecord> getPrimaryKey() {
        return Keys.KEY_NEWSTYPES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NewstypesRecord>> getKeys() {
        return Arrays.<UniqueKey<NewstypesRecord>>asList(Keys.KEY_NEWSTYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Newstypes as(String alias) {
        return new Newstypes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Newstypes as(Name alias) {
        return new Newstypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Newstypes rename(String name) {
        return new Newstypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Newstypes rename(Name name) {
        return new Newstypes(name, null);
    }
}
