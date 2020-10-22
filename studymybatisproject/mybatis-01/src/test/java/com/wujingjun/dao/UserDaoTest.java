package com.wujingjun.dao;

import com.wujingjun.pojo.User;
import com.wujingjun.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.List;

public class UserDaoTest {

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
    public void testfindid(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.findUserById(2);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void testinsert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setName("wpp");
        user.setPassword("100");

        int i = userMapper.addUser(user);

        System.out.println(i);

        //增删改一定要进行事务提交
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testupdate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setId(2);
        user.setName("wii");
        user.setPassword("000");

        int i = userMapper.updateUser(user);

        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testdelete(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int i = userMapper.deleteUser(5);

        System.out.println(i);

        sqlSession.commit();

        sqlSession.close();


    }

}
