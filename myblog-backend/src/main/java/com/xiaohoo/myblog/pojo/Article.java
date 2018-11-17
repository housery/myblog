package com.xiaohoo.myblog.pojo;

import javax.persistence.*;

public class Article {
    /**
     * 文章id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 文章分类id
     */
    @Column(name = "cat_id")
    private Integer catId;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 获取文章id
     *
     * @return id - 文章id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置文章id
     *
     * @param id 文章id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取文章标题
     *
     * @return title - 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置文章标题
     *
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取文章用户id
     *
     * @return user_id - 文章用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置文章用户id
     *
     * @param userId 文章用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取文章分类id
     *
     * @return cat_id - 文章分类id
     */
    public Integer getCatId() {
        return catId;
    }

    /**
     * 设置文章分类id
     *
     * @param catId 文章分类id
     */
    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    /**
     * 获取文章内容
     *
     * @return content - 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置文章内容
     *
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}