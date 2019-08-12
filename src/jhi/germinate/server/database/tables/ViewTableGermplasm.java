/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.math.*;
import java.sql.*;

import javax.annotation.*;

import jhi.germinate.server.database.*;
import jhi.germinate.server.database.tables.records.*;


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
public class ViewTableGermplasm extends TableImpl<ViewTableGermplasmRecord> {

    /**
     * The reference instance of <code>germinate_template_3_7_0.view_table_germplasm</code>
     */
    public static final ViewTableGermplasm VIEW_TABLE_GERMPLASM = new ViewTableGermplasm();
    private static final long serialVersionUID = 488828211;
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.germplasmId</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableGermplasmRecord, Integer> GERMPLASMID = createField("germplasmId", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.germplasmGid</code>. A unique identifier.
     */
    public final TableField<ViewTableGermplasmRecord, String> GERMPLASMGID = createField("germplasmGid", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "A unique identifier.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.germplasmName</code>. A unique name which defines an entry in the germinatbase table.
     */
    public final TableField<ViewTableGermplasmRecord, String> GERMPLASMNAME = createField("germplasmName", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "A unique name which defines an entry in the germinatbase table.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.germplasmNumber</code>. This is the unique identifier for accessions within a genebank, and is assigned when a sample is
entered into the genebank collection (e.g. ‘PI 113869’).
     */
    public final TableField<ViewTableGermplasmRecord, String> GERMPLASMNUMBER = createField("germplasmNumber", org.jooq.impl.SQLDataType.VARCHAR(255), this, "This is the unique identifier for accessions within a genebank, and is assigned when a sample is\nentered into the genebank collection (e.g. ‘PI 113869’).");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.germplasmPuid</code>. Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession.
     */
    public final TableField<ViewTableGermplasmRecord, String> GERMPLASMPUID = createField("germplasmPuid", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.entityTypeId</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableGermplasmRecord, Integer> ENTITYTYPEID = createField("entityTypeId", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.entityTypeName</code>. The name of the entity type.
     */
    public final TableField<ViewTableGermplasmRecord, String> ENTITYTYPENAME = createField("entityTypeName", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The name of the entity type.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.biologicalStatusId</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableGermplasmRecord, Integer> BIOLOGICALSTATUSID = createField("biologicalStatusId", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.biologicalStatusName</code>. Previoulsy known as sampstat.
     */
    public final TableField<ViewTableGermplasmRecord, String> BIOLOGICALSTATUSNAME = createField("biologicalStatusName", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Previoulsy known as sampstat.");
    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<ViewTableGermplasmRecord, Object> SYNONYMS = createField("synonyms", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_3_7_0\".\"view_table_germplasm_synonyms\""), this, "The synonyms as a json array.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.collectorNumber</code>. Original identifier assigned by the collector(s) of the sample, normally composed of the name or
initials of the collector(s) followed by a number (e.g. ‘FM9909’). This identifier is essential for
identifying duplicates held in different collections.
     */
    public final TableField<ViewTableGermplasmRecord, String> COLLECTORNUMBER = createField("collectorNumber", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Original identifier assigned by the collector(s) of the sample, normally composed of the name or\ninitials of the collector(s) followed by a number (e.g. ‘FM9909’). This identifier is essential for\nidentifying duplicates held in different collections.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.genus</code>. Genus name for the species.
     */
    public final TableField<ViewTableGermplasmRecord, String> GENUS = createField("genus", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "Genus name for the species.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.species</code>. Species name in lowercase.
     */
    public final TableField<ViewTableGermplasmRecord, String> SPECIES = createField("species", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "Species name in lowercase.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.subtaxa</code>. Subtaxa name.
     */
    public final TableField<ViewTableGermplasmRecord, String> SUBTAXA = createField("subtaxa", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Subtaxa name.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.elevation</code>. The elevation of the site in metres.
     */
    public final TableField<ViewTableGermplasmRecord, BigDecimal> ELEVATION = createField("elevation", org.jooq.impl.SQLDataType.DECIMAL(64, 10), this, "The elevation of the site in metres.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.countryName</code>. Country name.
     */
    public final TableField<ViewTableGermplasmRecord, String> COUNTRYNAME = createField("countryName", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "Country name.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.countryCode</code>. ISO 2 Code for country.
     */
    public final TableField<ViewTableGermplasmRecord, String> COUNTRYCODE = createField("countryCode", org.jooq.impl.SQLDataType.CHAR(2).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "ISO 2 Code for country.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.collDate</code>. Collecting date of the sample, where YYYY is the year, MM is the month and DD is the day.
Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero].
     */
    public final TableField<ViewTableGermplasmRecord, Date> COLLDATE = createField("collDate", org.jooq.impl.SQLDataType.DATE, this, "Collecting date of the sample, where YYYY is the year, MM is the month and DD is the day.\nMissing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero]. ");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.pdci</code>. Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.
     */
    public final TableField<ViewTableGermplasmRecord, Double> PDCI = createField("pdci", org.jooq.impl.SQLDataType.FLOAT, this, "Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.imageCount</code>.
     */
    public final TableField<ViewTableGermplasmRecord, Long> IMAGECOUNT = createField("imageCount", org.jooq.impl.SQLDataType.BIGINT, this, "");
    /**
     * The column <code>germinate_template_3_7_0.view_table_germplasm.firstImagePath</code>.
     */
    public final TableField<ViewTableGermplasmRecord, String> FIRSTIMAGEPATH = createField("firstImagePath", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>germinate_template_3_7_0.view_table_germplasm</code> table reference
     */
    public ViewTableGermplasm() {
        this(DSL.name("view_table_germplasm"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.view_table_germplasm</code> table reference
     */
    public ViewTableGermplasm(String alias) {
        this(DSL.name(alias), VIEW_TABLE_GERMPLASM);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.view_table_germplasm</code> table reference
     */
    public ViewTableGermplasm(Name alias) {
        this(alias, VIEW_TABLE_GERMPLASM);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableGermplasmRecord> getRecordType() {
        return ViewTableGermplasmRecord.class;
    }

    private ViewTableGermplasm(Name alias, Table<ViewTableGermplasmRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableGermplasm(Name alias, Table<ViewTableGermplasmRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> ViewTableGermplasm(Table<O> child, ForeignKey<O, ViewTableGermplasmRecord> key) {
        super(child, key, VIEW_TABLE_GERMPLASM);
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
    public ViewTableGermplasm as(String alias) {
        return new ViewTableGermplasm(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableGermplasm as(Name alias) {
        return new ViewTableGermplasm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableGermplasm rename(String name) {
        return new ViewTableGermplasm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableGermplasm rename(Name name) {
        return new ViewTableGermplasm(name, null);
    }
}
