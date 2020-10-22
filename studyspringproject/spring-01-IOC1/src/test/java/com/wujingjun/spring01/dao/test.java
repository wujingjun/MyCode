package com.wujingjun.spring01.dao;

import com.wuijngjun.spring01.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        UserServiceImpl uerServiceImpl = (UserServiceImpl) applicationContext.getBean("UserServiceImpl");

        uerServiceImpl.choose();
    }
}
