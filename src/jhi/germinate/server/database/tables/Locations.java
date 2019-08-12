/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.math.*;
import java.sql.*;
import java.util.*;

import javax.annotation.*;

import jhi.germinate.server.database.*;
import jhi.germinate.server.database.tables.records.*;


/**
 * Describes locations. Locations can be collecting sites or the location 
 * of any geographical feature such as research institutes or lab locations.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Locations extends TableImpl<LocationsRecord> {

    /**
     * The reference instance of <code>germinate_template_3_7_0.locations</code>
     */
    public static final Locations LOCATIONS = new Locations();
    private static final long serialVersionUID = -34301168;
    /**
     * The column <code>germinate_template_3_7_0.locations.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<LocationsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");
    /**
     * The column <code>germinate_template_3_7_0.locations.locationtype_id</code>. Foreign key to locations (locations.id).
     */
    public final TableField<LocationsRecord, Integer> LOCATIONTYPE_ID = createField("locationtype_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key to locations (locations.id).");
    /**
     * The column <code>germinate_template_3_7_0.locations.country_id</code>. Foreign key to countries (countries.id).
     */
    public final TableField<LocationsRecord, Integer> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Foreign key to countries (countries.id).");
    /**
     * The column <code>germinate_template_3_7_0.locations.state</code>. The state where the location is if this exists.
     */
    public final TableField<LocationsRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The state where the location is if this exists.");
    /**
     * The column <code>germinate_template_3_7_0.locations.region</code>. The region where the location is if this exists.
     */
    public final TableField<LocationsRecord, String> REGION = createField("region", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The region where the location is if this exists.");
    /**
     * The column <code>germinate_template_3_7_0.locations.site_name</code>. The site name where the location is.
     */
    public final TableField<LocationsRecord, String> SITE_NAME = createField("site_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "The site name where the location is.");
    /**
     * The column <code>germinate_template_3_7_0.locations.site_name_short</code>. Shortened site name which can be used in tables within Germinate.
     */
    public final TableField<LocationsRecord, String> SITE_NAME_SHORT = createField("site_name_short", org.jooq.impl.SQLDataType.VARCHAR(22), this, "Shortened site name which can be used in tables within Germinate.");
    /**
     * The column <code>germinate_template_3_7_0.locations.elevation</code>. The elevation of the site in metres.
     */
    public final TableField<LocationsRecord, BigDecimal> ELEVATION = createField("elevation", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "The elevation of the site in metres.");
    /**
     * The column <code>germinate_template_3_7_0.locations.latitude</code>. Latitude of the location.
     */
    public final TableField<LocationsRecord, BigDecimal> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "Latitude of the location.");
    /**
     * The column <code>germinate_template_3_7_0.locations.longitude</code>. Longitude of the location.
     */
    public final TableField<LocationsRecord, BigDecimal> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "Longitude of the location.");
    /**
     * The column <code>germinate_template_3_7_0.locations.coordinate_uncertainty</code>. Uncertainty associated with the coordinates in metres. Leave the value empty if the uncertainty is unknown.
     */
    public final TableField<LocationsRecord, Integer> COORDINATE_UNCERTAINTY = createField("coordinate_uncertainty", org.jooq.impl.SQLDataType.INTEGER, this, "Uncertainty associated with the coordinates in metres. Leave the value empty if the uncertainty is unknown. ");
    /**
     * The column <code>germinate_template_3_7_0.locations.coordinate_datum</code>. The geodetic datum or spatial reference system upon which the coordinates given in decimal latitude and decimal longitude are based (e.g. WGS84, ETRS89, NAD83). The GPS uses the WGS84 datum.
     */
    public final TableField<LocationsRecord, String> COORDINATE_DATUM = createField("coordinate_datum", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The geodetic datum or spatial reference system upon which the coordinates given in decimal latitude and decimal longitude are based (e.g. WGS84, ETRS89, NAD83). The GPS uses the WGS84 datum.");
    /**
     * The column <code>germinate_template_3_7_0.locations.georeferencing_method</code>. The georeferencing method used (GPS, determined from map, gazetteer, or estimated using software). Leave the value empty if georeferencing method is not known.
     */
    public final TableField<LocationsRecord, String> GEOREFERENCING_METHOD = createField("georeferencing_method", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The georeferencing method used (GPS, determined from map, gazetteer, or estimated using software). Leave the value empty if georeferencing method is not known.");
    /**
     * The column <code>germinate_template_3_7_0.locations.created_on</code>. When the record was created.
     */
    public final TableField<LocationsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");
    /**
     * The column <code>germinate_template_3_7_0.locations.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<LocationsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.locations</code> table reference
     */
    public Locations() {
        this(DSL.name("locations"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.locations</code> table reference
     */
    public Locations(String alias) {
        this(DSL.name(alias), LOCATIONS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.locations</code> table reference
     */
    public Locations(Name alias) {
        this(alias, LOCATIONS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocationsRecord> getRecordType() {
        return LocationsRecord.class;
    }

    private Locations(Name alias, Table<LocationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Locations(Name alias, Table<LocationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Describes locations. Locations can be collecting sites or the location of any geographical feature such as research institutes or lab locations."));
    }

    public <O extends Record> Locations(Table<O> child, ForeignKey<O, LocationsRecord> key) {
        super(child, key, LOCATIONS);
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
        return Arrays.<Index>asList(Indexes.LOCATIONS_COUNTRY_ID, Indexes.LOCATIONS_LOCATIONS_IBFK_2, Indexes.LOCATIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LocationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LocationsRecord> getPrimaryKey() {
        return Keys.KEY_LOCATIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LocationsRecord>> getKeys() {
        return Arrays.<UniqueKey<LocationsRecord>>asList(Keys.KEY_LOCATIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LocationsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LocationsRecord, ?>>asList(Keys.LOCATIONS_IBFK_2, Keys.LOCATIONS_IBFK_1);
    }

    public Locationtypes locationtypes() {
        return new Locationtypes(this, Keys.LOCATIONS_IBFK_2);
    }

    public Countries countries() {
        return new Countries(this, Keys.LOCATIONS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Locations as(String alias) {
        return new Locations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Locations as(Name alias) {
        return new Locations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Locations rename(String name) {
        return new Locations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Locations rename(Name name) {
        return new Locations(name, null);
    }
}
