/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_3_7_0;
import jhi.germinate.server.database.tables.records.ClimateoverlaysRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * Climate overlays can be used in conjunction with OpenStreetMap in order 
 * to visualize climate data in a geographic context.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Climateoverlays extends TableImpl<ClimateoverlaysRecord> {

    private static final long serialVersionUID = -1801303118;

    /**
     * The reference instance of <code>germinate_template_3_7_0.climateoverlays</code>
     */
    public static final Climateoverlays CLIMATEOVERLAYS = new Climateoverlays();

    /**
     * The column <code>germinate_template_3_7_0.climateoverlays.is_legend</code>. The legend for the image. What colours represent in the overlays. This is not required but used if present.
     */
    public final TableField<ClimateoverlaysRecord, Byte> IS_LEGEND = createField("is_legend", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "The legend for the image. What colours represent in the overlays. This is not required but used if present. ");

    /**
     * The column <code>germinate_template_3_7_0.climateoverlays.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ClimateoverlaysRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.climateoverlays.climate_id</code>. Foreign key to climates (climates.id).
     */
    public final TableField<ClimateoverlaysRecord, Integer> CLIMATE_ID = createField("climate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key to climates (climates.id).");

    /**
     * The column <code>germinate_template_3_7_0.climateoverlays.path</code>. This is the path for holding images which can be used as overlays for the Google Maps representation in Germinate. The path is relative.
     */
    public final TableField<ClimateoverlaysRecord, String> PATH = createField("path", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "This is the path for holding images which can be used as overlays for the Google Maps representation in Germinate. The path is relative.");

    /**
     * The column <code>germinate_template_3_7_0.climateoverlays.bottom_left_longitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public final TableField<ClimateoverlaysRecord, Double> BOTTOM_LEFT_LONGITUDE = createField("bottom_left_longitude", org.jooq.impl.SQLDataType.DOUBLE, this, "Allows the allignment of images against OpenStreetMap API.");

    /**
     * The column <code>germinate_template_3_7_0.climateoverlays.bottom_left_latitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public final TableField<ClimateoverlaysRecord, Double> BOTTOM_LEFT_LATITUDE = createField("bottom_left_latitude", org.jooq.impl.SQLDataType.DOUBLE, this, "Allows the allignment of images against OpenStreetMap API.");

    /**
     * The column <code>germinate_template_3_7_0.climateoverlays.top_right_longitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public final TableField<ClimateoverlaysRecord, Double> TOP_RIGHT_LONGITUDE = createField("top_right_longitude", org.jooq.impl.SQLDataType.DOUBLE, this, "Allows the allignment of images against OpenStreetMap API.");

    /**
     * The column <code>germinate_template_3_7_0.climateoverlays.top_right_latitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public final TableField<ClimateoverlaysRecord, Double> TOP_RIGHT_LATITUDE = createField("top_right_latitude", org.jooq.impl.SQLDataType.DOUBLE, this, "Allows the allignment of images against OpenStreetMap API.");

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClimateoverlaysRecord> getRecordType() {
        return ClimateoverlaysRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.climateoverlays.description</code>. Describes the climate overlay if additional explanation of  the overlay image is required.
     */
    public final TableField<ClimateoverlaysRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "Describes the climate overlay if additional explanation of  the overlay image is required.");

    /**
     * The column <code>germinate_template_3_7_0.climateoverlays.created_on</code>. When the record was created.
     */
    public final TableField<ClimateoverlaysRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.climateoverlays.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<ClimateoverlaysRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.climateoverlays</code> table reference
     */
    public Climateoverlays() {
        this(DSL.name("climateoverlays"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.climateoverlays</code> table reference
     */
    public Climateoverlays(String alias) {
        this(DSL.name(alias), CLIMATEOVERLAYS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.climateoverlays</code> table reference
     */
    public Climateoverlays(Name alias) {
        this(alias, CLIMATEOVERLAYS);
    }

    private Climateoverlays(Name alias, Table<ClimateoverlaysRecord> aliased) {
        this(alias, aliased, null);
    }

    private Climateoverlays(Name alias, Table<ClimateoverlaysRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Climate overlays can be used in conjunction with OpenStreetMap in order to visualize climate data in a geographic context."));
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
    public Identity<ClimateoverlaysRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.tables.Climateoverlays.CLIMATEOVERLAYS, jhi.germinate.server.database.tables.Climateoverlays.CLIMATEOVERLAYS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClimateoverlaysRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.tables.Climateoverlays.CLIMATEOVERLAYS, "KEY_climateoverlays_PRIMARY", jhi.germinate.server.database.tables.Climateoverlays.CLIMATEOVERLAYS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClimateoverlaysRecord>> getKeys() {
        return Arrays.<UniqueKey<ClimateoverlaysRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.tables.Climateoverlays.CLIMATEOVERLAYS, "KEY_climateoverlays_PRIMARY", jhi.germinate.server.database.tables.Climateoverlays.CLIMATEOVERLAYS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Climateoverlays as(String alias) {
        return new Climateoverlays(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Climateoverlays as(Name alias) {
        return new Climateoverlays(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Climateoverlays rename(String name) {
        return new Climateoverlays(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Climateoverlays rename(Name name) {
        return new Climateoverlays(name, null);
    }
// @formatter:on
}