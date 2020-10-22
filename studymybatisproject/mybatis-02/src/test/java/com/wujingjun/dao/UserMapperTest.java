package com.wujingjun.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import wujingjun.dao.UserMapper;
import wujingjun.pojo.User;
import wujingjun.util.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> allUser = userMapper.findAllUser();

        for (User user : allUser) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void testlimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        Map<String,Integer> map = new HashMap<>();

        map.put("start",0);

        map.put("pageSize",3);

        List<User> users = userMapper.getUserByLimit(map);

        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
