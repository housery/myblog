package com.xiaohoo.myblog.pojo;

import javax.persistence.*;

public class Tag {
    /**
     * 文章分类id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标签
     */
    private String tag;

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
     * 获取标签
     *
     * @return tag - 标签
     */
    public String getTag() {
        return tag;
    }

    /**
     * 设置标签
     *
     * @param tag 标签
     */
    public void setTag(String tag) {
        this.tag = tag;
    }
}