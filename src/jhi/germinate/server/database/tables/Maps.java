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
 * Describes genetic maps that have been defined within Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Maps extends TableImpl<MapsRecord> {

    /**
     * The reference instance of <code>germinate_template_3_7_0.maps</code>
     */
    public static final Maps MAPS = new Maps();
    private static final long serialVersionUID = -1615724194;

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MapsRecord> getRecordType() {
        return MapsRecord.class;
    }
    /**
     * The column <code>germinate_template_3_7_0.maps.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<MapsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.maps.name</code>. Describes the map.
     */
    public final TableField<MapsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "Describes the map.");

    /**
     * The column <code>germinate_template_3_7_0.maps.description</code>. The name of this map.
     */
    public final TableField<MapsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "The name of this map.");

    /**
     * The column <code>germinate_template_3_7_0.maps.visibility</code>. Determines if the map is visible to the Germinate interface or hidden.
     */
    public final TableField<MapsRecord, Byte> VISIBILITY = createField("visibility", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "Determines if the map is visible to the Germinate interface or hidden.");

    /**
     * The column <code>germinate_template_3_7_0.maps.created_on</code>. When the record was created.
     */
    public final TableField<MapsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.maps.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<MapsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * The column <code>germinate_template_3_7_0.maps.user_id</code>. Foreign key to Gatekeeper users (Gatekeeper users.id).
     */
    public final TableField<MapsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key to Gatekeeper users (Gatekeeper users.id).");

    /**
     * Create a <code>germinate_template_3_7_0.maps</code> table reference
     */
    public Maps() {
        this(DSL.name("maps"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.maps</code> table reference
     */
    public Maps(String alias) {
        this(DSL.name(alias), MAPS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.maps</code> table reference
     */
    public Maps(Name alias) {
        this(alias, MAPS);
    }

    private Maps(Name alias, Table<MapsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Maps(Name alias, Table<MapsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Describes genetic maps that have been defined within Germinate."));
    }

    public <O extends Record> Maps(Table<O> child, ForeignKey<O, MapsRecord> key) {
        super(child, key, MAPS);
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
        return Arrays.<Index>asList(Indexes.MAPS_PRIMARY, Indexes.MAPS_USER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MapsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MAPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MapsRecord> getPrimaryKey() {
        return Keys.KEY_MAPS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MapsRecord>> getKeys() {
        return Arrays.<UniqueKey<MapsRecord>>asList(Keys.KEY_MAPS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Maps as(String alias) {
        return new Maps(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Maps as(Name alias) {
        return new Maps(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Maps rename(String name) {
        return new Maps(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Maps rename(Name name) {
        return new Maps(name, null);
    }
}
