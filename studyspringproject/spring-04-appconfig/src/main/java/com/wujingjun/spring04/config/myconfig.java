package com.wujingjun.spring04.config;


import com.wujingjun.spring04.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wujingjun.spring04.pojo")
public class myconfig {

    /**
     * 注册一个bean,就相当于我们之前写的第一个bean标签
     * 这个方法的名字，就相当于bean标签的id属性
     * 这个方法的返回值，就相当于bean标签中的class属性
     *
     */
    @Bean

    public User getUser(){
        return new User();//就是返回要注入到bean的对象
    }

}
