package com.wujingjun.spring6;

import com.wujingjun.spring06.service.UserService;
import com.wujingjun.spring06.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        //动态代理代理的是接口
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.add();
    }
}
