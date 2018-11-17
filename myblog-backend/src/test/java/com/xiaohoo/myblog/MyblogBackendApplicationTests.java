package com.xiaohoo.myblog;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaohoo.myblog.dao.UserMapper;
import com.xiaohoo.myblog.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class MyblogBackendApplicationTests {

    private static Logger logger = LoggerFactory.getLogger(MyblogBackendApplicationTests.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void userListTest() throws Exception{

        PageHelper.startPage(0, 2);

        // 设置分页查询条件
        Example example = new Example(User.class);
        PageInfo<User> pageInfo = new PageInfo<>(userMapper.selectByExample(example));

        // 获取查询结果
        List<User> userList = pageInfo.getList();
        for (User user: userList){
            logger.info("----->" + user.getName() + " " + user.getCreateDate());
        }
    }

}
