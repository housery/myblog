package com.xiaohoo.myblog.pojo;

import javax.persistence.*;

public class Categorie {
    /**
     * 文章分类id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 文章id
     */
    @Column(name = "article_id")
    private Integer articleId;

    /**
     * 获取文章分类id
     *
     * @return id - 文章分类id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置文章分类id
     *
     * @param id 文章分类id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取文章id
     *
     * @return article_id - 文章id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * 设置文章id
     *
     * @param articleId 文章id
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
}