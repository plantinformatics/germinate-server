/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import com.google.gson.JsonArray;

import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_3_7_0;
import jhi.germinate.server.database.tables.records.ViewTableCompoundsRecord;
import jhi.germinate.server.util.SynonymBinding;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableCompounds extends TableImpl<ViewTableCompoundsRecord> {

    private static final long serialVersionUID = 920146076;

    /**
     * The reference instance of <code>germinate_template_3_7_0.view_table_compounds</code>
     */
    public static final ViewTableCompounds VIEW_TABLE_COMPOUNDS = new ViewTableCompounds();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableCompoundsRecord> getRecordType() {
        return ViewTableCompoundsRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.view_table_compounds.compound_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCompoundsRecord, Integer> COMPOUND_ID = createField("compound_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.view_table_compounds.compound_name</code>. Compound full name.
     */
    public final TableField<ViewTableCompoundsRecord, String> COMPOUND_NAME = createField("compound_name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "Compound full name.");

    /**
     * The column <code>germinate_template_3_7_0.view_table_compounds.compound_description</code>. Full description of the compound. This should contain enough infomation to accurately identify the compound and how it was recorded.
     */
    public final TableField<ViewTableCompoundsRecord, String> COMPOUND_DESCRIPTION = createField("compound_description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Full description of the compound. This should contain enough infomation to accurately identify the compound and how it was recorded.");

    /**
     * The column <code>germinate_template_3_7_0.view_table_compounds.unit_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCompoundsRecord, Integer> UNIT_ID = createField("unit_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.view_table_compounds.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public final TableField<ViewTableCompoundsRecord, String> UNIT_NAME = createField("unit_name", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "The name of the unit. This should be the name of the unit in full.");

    /**
     * The column <code>germinate_template_3_7_0.view_table_compounds.unit_description</code>. A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.
     */
    public final TableField<ViewTableCompoundsRecord, String> UNIT_DESCRIPTION = createField("unit_description", org.jooq.impl.SQLDataType.CLOB, this, "A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.");

    /**
     * The column <code>germinate_template_3_7_0.view_table_compounds.unit_abbreviation</code>. This should be the unit abbreviation.
     */
    public final TableField<ViewTableCompoundsRecord, String> UNIT_ABBREVIATION = createField("unit_abbreviation", org.jooq.impl.SQLDataType.CHAR(10), this, "This should be the unit abbreviation.");

    /**
     * The column <code>germinate_template_3_7_0.view_table_compounds.synonyms</code>. The synonyms as a json array.
     */
    public final TableField<ViewTableCompoundsRecord, JsonArray> SYNONYMS = createField("synonyms", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_3_7_0\".\"view_table_compounds_synonyms\""), this, "The synonyms as a json array.", new SynonymBinding());

    /**
     * The column <code>germinate_template_3_7_0.view_table_compounds.count</code>.
     */
    public final TableField<ViewTableCompoundsRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>germinate_template_3_7_0.view_table_compounds</code> table reference
     */
    public ViewTableCompounds() {
        this(DSL.name("view_table_compounds"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.view_table_compounds</code> table reference
     */
    public ViewTableCompounds(String alias) {
        this(DSL.name(alias), VIEW_TABLE_COMPOUNDS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.view_table_compounds</code> table reference
     */
    public ViewTableCompounds(Name alias) {
        this(alias, VIEW_TABLE_COMPOUNDS);
    }

    private ViewTableCompounds(Name alias, Table<ViewTableCompoundsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableCompounds(Name alias, Table<ViewTableCompoundsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
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
    public ViewTableCompounds as(String alias) {
        return new ViewTableCompounds(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompounds as(Name alias) {
        return new ViewTableCompounds(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableCompounds rename(String name) {
        return new ViewTableCompounds(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableCompounds rename(Name name) {
        return new ViewTableCompounds(name, null);
    }
// @formatter:on
}
