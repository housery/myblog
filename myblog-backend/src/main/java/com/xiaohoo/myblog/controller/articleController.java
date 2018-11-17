package com.xiaohoo.myblog.controller;

import com.xiaohoo.myblog.dao.ArticleMapper;
import com.xiaohoo.myblog.pojo.Article;
import com.xiaohoo.myblog.pojo.Result;
import com.xiaohoo.myblog.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

/**
 * @author: xiaohoo
 * @date: 2018/11/17 21:33
 * @email: 1126457667@qq.com
 */
@RestController
@Api(description = "文章管理")
@RequestMapping(value = "/ariticle")
public class articleController {
    private static final Logger logger = LoggerFactory.getLogger(articleController.class);

    @Autowired
    private ArticleMapper articleMapper;

    @RequestMapping(value = "/count/{userId}", method = RequestMethod.GET)
    @ApiOperation(value = "根据用户id获取文章数")
    public Result<Object> getAritcleCount(@PathVariable int userId){
        Example example = new Example(Article.class);
        example.createCriteria().andEqualTo("userId", userId);

        int count = articleMapper.selectCountByExample(example);
        return new ResultUtil<>().setData(count);
    }
}
