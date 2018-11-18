package com.xiaohoo.myblog.dao;

import com.xiaohoo.myblog.pojo.Article;
import com.xiaohoo.myblog.pojo.Tag;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.MyMapper;

import java.util.List;

public interface ArticleMapper extends MyMapper<Article> {

    // @Select("select tag.id, tag from article_tag join tag on tag_id = tag.id where art_id = #{artId}")
    List<Tag> getArtTagByArtId(int artId);
}