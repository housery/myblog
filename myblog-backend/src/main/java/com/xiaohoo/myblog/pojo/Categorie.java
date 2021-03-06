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
     * 分类
     */
    private String cat;

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
     * 获取分类
     *
     * @return cat - 分类
     */
    public String getCat() {
        return cat;
    }

    /**
     * 设置分类
     *
     * @param cat 分类
     */
    public void setCat(String cat) {
        this.cat = cat;
    }
}