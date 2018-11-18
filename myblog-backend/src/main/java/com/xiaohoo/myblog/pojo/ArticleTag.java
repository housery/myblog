package com.xiaohoo.myblog.pojo;

import javax.persistence.*;

@Table(name = "article_tag")
public class ArticleTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 文章id
     */
    @Column(name = "art_id")
    private Integer artId;

    /**
     * 标签id
     */
    @Column(name = "tag_id")
    private Integer tagId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取文章id
     *
     * @return art_id - 文章id
     */
    public Integer getArtId() {
        return artId;
    }

    /**
     * 设置文章id
     *
     * @param artId 文章id
     */
    public void setArtId(Integer artId) {
        this.artId = artId;
    }

    /**
     * 获取标签id
     *
     * @return tag_id - 标签id
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * 设置标签id
     *
     * @param tagId 标签id
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}