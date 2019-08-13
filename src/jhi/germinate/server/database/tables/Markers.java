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
 * Defines genetic markers within the database and assigns a type (markertypes).
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Markers extends TableImpl<MarkersRecord> {

    private static final long serialVersionUID = -551372124;

    /**
     * The reference instance of <code>germinate_template_3_7_0.markers</code>
     */
    public static final Markers MARKERS = new Markers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MarkersRecord> getRecordType() {
        return MarkersRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.markers.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<MarkersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.markers.markertype_id</code>. Foreign key to locations (locations.id).
     */
    public final TableField<MarkersRecord, Integer> MARKERTYPE_ID = createField("markertype_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key to locations (locations.id).");

    /**
     * The column <code>germinate_template_3_7_0.markers.marker_name</code>. The name of the marker. This should be a unique name which identifies the marker.
     */
    public final TableField<MarkersRecord, String> MARKER_NAME = createField("marker_name", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "The name of the marker. This should be a unique name which identifies the marker.");

    /**
     * The column <code>germinate_template_3_7_0.markers.created_on</code>. When the record was created.

     */
    public final TableField<MarkersRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.\n");

    /**
     * The column <code>germinate_template_3_7_0.markers.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<MarkersRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.markers</code> table reference
     */
    public Markers() {
        this(DSL.name("markers"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.markers</code> table reference
     */
    public Markers(String alias) {
        this(DSL.name(alias), MARKERS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.markers</code> table reference
     */
    public Markers(Name alias) {
        this(alias, MARKERS);
    }

    private Markers(Name alias, Table<MarkersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Markers(Name alias, Table<MarkersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines genetic markers within the database and assigns a type (markertypes)."));
    }

    public <O extends Record> Markers(Table<O> child, ForeignKey<O, MarkersRecord> key) {
        super(child, key, MARKERS);
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
        return Arrays.<Index>asList(Indexes.MARKERS_MARKERTYPE_ID, Indexes.MARKERS_MARKER_NAME, Indexes.MARKERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MarkersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MARKERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MarkersRecord> getPrimaryKey() {
        return Keys.KEY_MARKERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MarkersRecord>> getKeys() {
        return Arrays.<UniqueKey<MarkersRecord>>asList(Keys.KEY_MARKERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MarkersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MarkersRecord, ?>>asList(Keys.MARKERS_IBFK_1);
    }

    public Markertypes markertypes() {
        return new Markertypes(this, Keys.MARKERS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Markers as(String alias) {
        return new Markers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Markers as(Name alias) {
        return new Markers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Markers rename(String name) {
        return new Markers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Markers rename(Name name) {
        return new Markers(name, null);
    }
}
