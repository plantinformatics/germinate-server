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
 * Holds news items that are displayed within Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class News extends TableImpl<NewsRecord> {

    /**
     * The reference instance of <code>germinate_template_3_7_0.news</code>
     */
    public static final News NEWS = new News();
    private static final long serialVersionUID = 1409948326;

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NewsRecord> getRecordType() {
        return NewsRecord.class;
    }
    /**
     * The column <code>germinate_template_3_7_0.news.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<NewsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.news.newstype_id</code>. Foreign key newstypes (newstypes.id).
     */
    public final TableField<NewsRecord, Integer> NEWSTYPE_ID = createField("newstype_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key newstypes (newstypes.id).");

    /**
     * The column <code>germinate_template_3_7_0.news.title</code>. A title which is used to name this news item. This appears in the Germinate user interface if used.
     */
    public final TableField<NewsRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A title which is used to name this news item. This appears in the Germinate user interface if used.");

    /**
     * The column <code>germinate_template_3_7_0.news.content</code>. The textual content of this news item.
     */
    public final TableField<NewsRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "The textual content of this news item.");

    /**
     * The column <code>germinate_template_3_7_0.news.image</code>. Image to use with this news item.
     */
    public final TableField<NewsRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Image to use with this news item.");

    /**
     * The column <code>germinate_template_3_7_0.news.hyperlink</code>. HTML hyperlink to use for this news item. This can be a link to another source which contains more information or a link to the original source.
     */
    public final TableField<NewsRecord, String> HYPERLINK = createField("hyperlink", org.jooq.impl.SQLDataType.VARCHAR(255), this, "HTML hyperlink to use for this news item. This can be a link to another source which contains more information or a link to the original source.");

    /**
     * The column <code>germinate_template_3_7_0.news.user_id</code>. Foreign key users (users.id).
     */
    public final TableField<NewsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key users (users.id).");

    /**
     * The column <code>germinate_template_3_7_0.news.created_on</code>. When the record was created.
     */
    public final TableField<NewsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.news.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<NewsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.news</code> table reference
     */
    public News() {
        this(DSL.name("news"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.news</code> table reference
     */
    public News(String alias) {
        this(DSL.name(alias), NEWS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.news</code> table reference
     */
    public News(Name alias) {
        this(alias, NEWS);
    }

    private News(Name alias, Table<NewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private News(Name alias, Table<NewsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Holds news items that are displayed within Germinate."));
    }

    public <O extends Record> News(Table<O> child, ForeignKey<O, NewsRecord> key) {
        super(child, key, NEWS);
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
        return Arrays.<Index>asList(Indexes.NEWS_NEWS_TYPE_ID, Indexes.NEWS_NEWS_UPDATED_ON, Indexes.NEWS_NEWS_USER_ID, Indexes.NEWS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<NewsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_NEWS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NewsRecord> getPrimaryKey() {
        return Keys.KEY_NEWS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NewsRecord>> getKeys() {
        return Arrays.<UniqueKey<NewsRecord>>asList(Keys.KEY_NEWS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<NewsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<NewsRecord, ?>>asList(Keys.NEWS_IBFK_1);
    }

    public Newstypes newstypes() {
        return new Newstypes(this, Keys.NEWS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public News as(String alias) {
        return new News(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public News as(Name alias) {
        return new News(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public News rename(String name) {
        return new News(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public News rename(Name name) {
        return new News(name, null);
    }
}
