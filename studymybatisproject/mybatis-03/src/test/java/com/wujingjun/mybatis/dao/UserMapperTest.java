package com.wujingjun.mybatis.dao;

import com.wujingjun.mybatis3.dao.UserMapper;
import com.wujingjun.mybatis3.pojo.User;
import com.wujingjun.mybatis3.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.getUsers();

        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User userById = userMapper.getUserById(2);

        System.out.println(userById);

    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setName("wmm");
        user.setPassword("999");

        int i = userMapper.addUser(user);

        System.out.println(i);

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setId(7);
        user.setName("woo");
        user.setPassword("888");

        int i = userMapper.updateUser(user);

        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int i = userMapper.deleteUser(7);

        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();
    }

}
