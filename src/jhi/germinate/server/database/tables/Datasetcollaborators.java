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
public class Datasetcollaborators extends TableImpl<DatasetcollaboratorsRecord> {

    private static final long serialVersionUID = -298665542;

    /**
     * The reference instance of <code>germinate_template_3_7_0.datasetcollaborators</code>
     */
    public static final Datasetcollaborators DATASETCOLLABORATORS = new Datasetcollaborators();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetcollaboratorsRecord> getRecordType() {
        return DatasetcollaboratorsRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.datasetcollaborators.id</code>.
     */
    public final TableField<DatasetcollaboratorsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_template_3_7_0.datasetcollaborators.dataset_id</code>.
     */
    public final TableField<DatasetcollaboratorsRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.datasetcollaborators.collaborator_id</code>.
     */
    public final TableField<DatasetcollaboratorsRecord, Integer> COLLABORATOR_ID = createField("collaborator_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.datasetcollaborators.created_on</code>. When the record was created.
     */
    public final TableField<DatasetcollaboratorsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.datasetcollaborators.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<DatasetcollaboratorsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.datasetcollaborators</code> table reference
     */
    public Datasetcollaborators() {
        this(DSL.name("datasetcollaborators"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.datasetcollaborators</code> table reference
     */
    public Datasetcollaborators(String alias) {
        this(DSL.name(alias), DATASETCOLLABORATORS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.datasetcollaborators</code> table reference
     */
    public Datasetcollaborators(Name alias) {
        this(alias, DATASETCOLLABORATORS);
    }

    private Datasetcollaborators(Name alias, Table<DatasetcollaboratorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Datasetcollaborators(Name alias, Table<DatasetcollaboratorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Datasetcollaborators(Table<O> child, ForeignKey<O, DatasetcollaboratorsRecord> key) {
        super(child, key, DATASETCOLLABORATORS);
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
        return Arrays.<Index>asList(Indexes.DATASETCOLLABORATORS_COLLABORATOR_ID, Indexes.DATASETCOLLABORATORS_DATASET_ID, Indexes.DATASETCOLLABORATORS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DatasetcollaboratorsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DATASETCOLLABORATORS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DatasetcollaboratorsRecord> getPrimaryKey() {
        return Keys.KEY_DATASETCOLLABORATORS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatasetcollaboratorsRecord>> getKeys() {
        return Arrays.<UniqueKey<DatasetcollaboratorsRecord>>asList(Keys.KEY_DATASETCOLLABORATORS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DatasetcollaboratorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DatasetcollaboratorsRecord, ?>>asList(Keys.DATASETCOLLABORATORS_IBFK_1, Keys.DATASETCOLLABORATORS_IBFK_2);
    }

    public Datasets datasets() {
        return new Datasets(this, Keys.DATASETCOLLABORATORS_IBFK_1);
    }

    public Collaborators collaborators() {
        return new Collaborators(this, Keys.DATASETCOLLABORATORS_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetcollaborators as(String alias) {
        return new Datasetcollaborators(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetcollaborators as(Name alias) {
        return new Datasetcollaborators(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetcollaborators rename(String name) {
        return new Datasetcollaborators(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetcollaborators rename(Name name) {
        return new Datasetcollaborators(name, null);
    }
}
