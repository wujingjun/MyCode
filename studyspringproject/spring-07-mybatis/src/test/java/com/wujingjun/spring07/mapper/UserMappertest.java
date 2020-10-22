package com.wujingjun.spring07.mapper;

import com.wujingjun.spring07.pojo.User;
import com.wujingjun.spring07.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMappertest {

    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test1(){
        ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = (UserMapper) ApplicationContext.getBean("UserMapper");

        List<User> users = userMapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void test2(){
        ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = (UserMapper) ApplicationContext.getBean("UserMapper1");

        List<User> users = userMapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }
    }


}
