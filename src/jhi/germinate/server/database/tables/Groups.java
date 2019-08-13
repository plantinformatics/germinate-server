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
 * Allows the definition of groups within Germinate. Germinate supports a 
 * number of different group types such as germinatebase accesion groups and 
 * marker groups.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Groups extends TableImpl<GroupsRecord> {

    private static final long serialVersionUID = 1390763292;

    /**
     * The reference instance of <code>germinate_template_3_7_0.groups</code>
     */
    public static final Groups GROUPS = new Groups();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupsRecord> getRecordType() {
        return GroupsRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.groups.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<GroupsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.groups.grouptype_id</code>. Foreign key to grouptypes (grouptypes.id).
     */
    public final TableField<GroupsRecord, Integer> GROUPTYPE_ID = createField("grouptype_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key to grouptypes (grouptypes.id).");

    /**
     * The column <code>germinate_template_3_7_0.groups.name</code>. The name of the group which can be used to identify it.
     */
    public final TableField<GroupsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The name of the group which can be used to identify it.");

    /**
     * The column <code>germinate_template_3_7_0.groups.description</code>. A free text description of the group. This has no length limitations.
     */
    public final TableField<GroupsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "A free text description of the group. This has no length limitations.");

    /**
     * The column <code>germinate_template_3_7_0.groups.visibility</code>. Defines if the group is visuble or hidden from the Germinate user interface.
     */
    public final TableField<GroupsRecord, Byte> VISIBILITY = createField("visibility", org.jooq.impl.SQLDataType.TINYINT, this, "Defines if the group is visuble or hidden from the Germinate user interface.");

    /**
     * The column <code>germinate_template_3_7_0.groups.created_by</code>. Defines who created the group. Foreign key to Gatekeeper users (Gatekeeper users.id).
     */
    public final TableField<GroupsRecord, Integer> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.INTEGER, this, "Defines who created the group. Foreign key to Gatekeeper users (Gatekeeper users.id).");

    /**
     * The column <code>germinate_template_3_7_0.groups.created_on</code>. Foreign key to locations (locations.id).
     */
    public final TableField<GroupsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "Foreign key to locations (locations.id).");

    /**
     * The column <code>germinate_template_3_7_0.groups.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<GroupsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.groups</code> table reference
     */
    public Groups() {
        this(DSL.name("groups"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.groups</code> table reference
     */
    public Groups(String alias) {
        this(DSL.name(alias), GROUPS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.groups</code> table reference
     */
    public Groups(Name alias) {
        this(alias, GROUPS);
    }

    private Groups(Name alias, Table<GroupsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Groups(Name alias, Table<GroupsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Allows the definition of groups within Germinate. Germinate supports a number of different group types such as germinatebase accesion groups and marker groups."));
    }

    public <O extends Record> Groups(Table<O> child, ForeignKey<O, GroupsRecord> key) {
        super(child, key, GROUPS);
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
        return Arrays.<Index>asList(Indexes.GROUPS_GROUPTYPE_ID, Indexes.GROUPS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GroupsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GROUPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GroupsRecord> getPrimaryKey() {
        return Keys.KEY_GROUPS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GroupsRecord>> getKeys() {
        return Arrays.<UniqueKey<GroupsRecord>>asList(Keys.KEY_GROUPS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<GroupsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GroupsRecord, ?>>asList(Keys.GROUPS_IBFK_1);
    }

    public Grouptypes grouptypes() {
        return new Grouptypes(this, Keys.GROUPS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Groups as(String alias) {
        return new Groups(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Groups as(Name alias) {
        return new Groups(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Groups rename(String name) {
        return new Groups(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Groups rename(Name name) {
        return new Groups(name, null);
    }
}
