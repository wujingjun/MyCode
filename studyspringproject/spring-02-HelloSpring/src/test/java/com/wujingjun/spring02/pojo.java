package com.wujingjun.spring02;

import com.wujingjuno.spring02.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class pojo {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        Hello hello = (Hello) applicationContext.getBean("Hello");

        System.out.println(hello.getStr());
    }

}
