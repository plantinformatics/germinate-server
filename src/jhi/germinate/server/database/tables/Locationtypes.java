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
 * Describes a location.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Locationtypes extends TableImpl<LocationtypesRecord> {

    private static final long serialVersionUID = -600018013;

    /**
     * The reference instance of <code>germinate_template_3_7_0.locationtypes</code>
     */
    public static final Locationtypes LOCATIONTYPES = new Locationtypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocationtypesRecord> getRecordType() {
        return LocationtypesRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.locationtypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<LocationtypesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.locationtypes.name</code>. The name of the location type. 
     */
    public final TableField<LocationtypesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "The name of the location type. ");

    /**
     * The column <code>germinate_template_3_7_0.locationtypes.description</code>. A description of the location type.
     */
    public final TableField<LocationtypesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A description of the location type.");

    /**
     * The column <code>germinate_template_3_7_0.locationtypes.created_on</code>. When the record was created.
     */
    public final TableField<LocationtypesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.locationtypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<LocationtypesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.locationtypes</code> table reference
     */
    public Locationtypes() {
        this(DSL.name("locationtypes"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.locationtypes</code> table reference
     */
    public Locationtypes(String alias) {
        this(DSL.name(alias), LOCATIONTYPES);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.locationtypes</code> table reference
     */
    public Locationtypes(Name alias) {
        this(alias, LOCATIONTYPES);
    }

    private Locationtypes(Name alias, Table<LocationtypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Locationtypes(Name alias, Table<LocationtypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Describes a location."));
    }

    public <O extends Record> Locationtypes(Table<O> child, ForeignKey<O, LocationtypesRecord> key) {
        super(child, key, LOCATIONTYPES);
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
        return Arrays.<Index>asList(Indexes.LOCATIONTYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LocationtypesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOCATIONTYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LocationtypesRecord> getPrimaryKey() {
        return Keys.KEY_LOCATIONTYPES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LocationtypesRecord>> getKeys() {
        return Arrays.<UniqueKey<LocationtypesRecord>>asList(Keys.KEY_LOCATIONTYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Locationtypes as(String alias) {
        return new Locationtypes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Locationtypes as(Name alias) {
        return new Locationtypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Locationtypes rename(String name) {
        return new Locationtypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Locationtypes rename(Name name) {
        return new Locationtypes(name, null);
    }
}
