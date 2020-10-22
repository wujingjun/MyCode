package com.wujingjun.spring03.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        Student student = (Student) applicationContext.getBean("Student");

        System.out.println(student);
    }
}
