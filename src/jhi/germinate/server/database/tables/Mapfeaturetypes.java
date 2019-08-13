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
 * Defines features which can exist on maps. In general this will be the marker 
 * type but it can also be used to identify QTL regions.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mapfeaturetypes extends TableImpl<MapfeaturetypesRecord> {

    private static final long serialVersionUID = -550733399;

    /**
     * The reference instance of <code>germinate_template_3_7_0.mapfeaturetypes</code>
     */
    public static final Mapfeaturetypes MAPFEATURETYPES = new Mapfeaturetypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MapfeaturetypesRecord> getRecordType() {
        return MapfeaturetypesRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.mapfeaturetypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<MapfeaturetypesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.mapfeaturetypes.description</code>. Description of the feature type. This could include a definition of the marker type such as 'SNP', 'KASP' or 'AFLP'.
     */
    public final TableField<MapfeaturetypesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Description of the feature type. This could include a definition of the marker type such as 'SNP', 'KASP' or 'AFLP'.");

    /**
     * The column <code>germinate_template_3_7_0.mapfeaturetypes.created_on</code>. When the record was created.
     */
    public final TableField<MapfeaturetypesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.mapfeaturetypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<MapfeaturetypesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.mapfeaturetypes</code> table reference
     */
    public Mapfeaturetypes() {
        this(DSL.name("mapfeaturetypes"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.mapfeaturetypes</code> table reference
     */
    public Mapfeaturetypes(String alias) {
        this(DSL.name(alias), MAPFEATURETYPES);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.mapfeaturetypes</code> table reference
     */
    public Mapfeaturetypes(Name alias) {
        this(alias, MAPFEATURETYPES);
    }

    private Mapfeaturetypes(Name alias, Table<MapfeaturetypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mapfeaturetypes(Name alias, Table<MapfeaturetypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines features which can exist on maps. In general this will be the marker type but it can also be used to identify QTL regions."));
    }

    public <O extends Record> Mapfeaturetypes(Table<O> child, ForeignKey<O, MapfeaturetypesRecord> key) {
        super(child, key, MAPFEATURETYPES);
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
        return Arrays.<Index>asList(Indexes.MAPFEATURETYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MapfeaturetypesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MAPFEATURETYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MapfeaturetypesRecord> getPrimaryKey() {
        return Keys.KEY_MAPFEATURETYPES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MapfeaturetypesRecord>> getKeys() {
        return Arrays.<UniqueKey<MapfeaturetypesRecord>>asList(Keys.KEY_MAPFEATURETYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mapfeaturetypes as(String alias) {
        return new Mapfeaturetypes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mapfeaturetypes as(Name alias) {
        return new Mapfeaturetypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mapfeaturetypes rename(String name) {
        return new Mapfeaturetypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mapfeaturetypes rename(Name name) {
        return new Mapfeaturetypes(name, null);
    }
}
