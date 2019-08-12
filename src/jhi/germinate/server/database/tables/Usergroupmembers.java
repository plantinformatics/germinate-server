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
public class Usergroupmembers extends TableImpl<UsergroupmembersRecord> {

    /**
     * The reference instance of <code>germinate_template_3_7_0.usergroupmembers</code>
     */
    public static final Usergroupmembers USERGROUPMEMBERS = new Usergroupmembers();
    private static final long serialVersionUID = -1224017390;

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsergroupmembersRecord> getRecordType() {
        return UsergroupmembersRecord.class;
    }
    /**
     * The column <code>germinate_template_3_7_0.usergroupmembers.id</code>.
     */
    public final TableField<UsergroupmembersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_template_3_7_0.usergroupmembers.user_id</code>.
     */
    public final TableField<UsergroupmembersRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.usergroupmembers.usergroup_id</code>.
     */
    public final TableField<UsergroupmembersRecord, Integer> USERGROUP_ID = createField("usergroup_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.usergroupmembers.created_on</code>. When the record was created.
     */
    public final TableField<UsergroupmembersRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.usergroupmembers.updated_on</code>. When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.
     */
    public final TableField<UsergroupmembersRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.usergroupmembers</code> table reference
     */
    public Usergroupmembers() {
        this(DSL.name("usergroupmembers"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.usergroupmembers</code> table reference
     */
    public Usergroupmembers(String alias) {
        this(DSL.name(alias), USERGROUPMEMBERS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.usergroupmembers</code> table reference
     */
    public Usergroupmembers(Name alias) {
        this(alias, USERGROUPMEMBERS);
    }

    private Usergroupmembers(Name alias, Table<UsergroupmembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Usergroupmembers(Name alias, Table<UsergroupmembersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Usergroupmembers(Table<O> child, ForeignKey<O, UsergroupmembersRecord> key) {
        super(child, key, USERGROUPMEMBERS);
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
        return Arrays.<Index>asList(Indexes.USERGROUPMEMBERS_PRIMARY, Indexes.USERGROUPMEMBERS_USERGROUP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UsergroupmembersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USERGROUPMEMBERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UsergroupmembersRecord> getPrimaryKey() {
        return Keys.KEY_USERGROUPMEMBERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsergroupmembersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsergroupmembersRecord>>asList(Keys.KEY_USERGROUPMEMBERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UsergroupmembersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UsergroupmembersRecord, ?>>asList(Keys.USERGROUPMEMBERS_IBFK_1);
    }

    public Usergroups usergroups() {
        return new Usergroups(this, Keys.USERGROUPMEMBERS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Usergroupmembers as(String alias) {
        return new Usergroupmembers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Usergroupmembers as(Name alias) {
        return new Usergroupmembers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Usergroupmembers rename(String name) {
        return new Usergroupmembers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Usergroupmembers rename(Name name) {
        return new Usergroupmembers(name, null);
    }
}
