package com.xiaohoo.myblog.service;

import com.xiaohoo.myblog.dao.ArticleMapper;
import com.xiaohoo.myblog.pojo.Article;
import com.xiaohoo.myblog.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: xiaohoo
 * @date: 2018/11/18 19:09
 * @email: 1126457667@qq.com
 */
@Service
@Transactional
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    public int getAritcleCountByuserId(int userId){
        Example example = new Example(Article.class);
        example.createCriteria().andEqualTo("userId", userId);

        int count = articleMapper.selectCountByExample(example);
        return count;
    }

    public List<Article> getArticleByUserId(int userId){
        Example example = new Example(Article.class);
        example.createCriteria().andEqualTo("userId", userId);

        List<Article> articleList = articleMapper.selectByExample(example);
        return articleList;
    }

    public List<Tag> getArticleTagByArtId(int artId){
        List<Tag> tagList = articleMapper.getArtTagByArtId(artId);
        return tagList;
    }

}
