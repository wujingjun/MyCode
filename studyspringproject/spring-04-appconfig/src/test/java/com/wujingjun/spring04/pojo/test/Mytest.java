package com.wujingjun.spring04.pojo.test;

import com.wujingjun.spring04.config.myconfig;
import com.wujingjun.spring04.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(myconfig.class);

        User user = (User) applicationContext.getBean("getUser");

        System.out.println(user);
    }
}
