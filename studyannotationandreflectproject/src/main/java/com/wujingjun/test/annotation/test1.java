package com.wujingjun.test.annotation;

import java.lang.annotation.*;

public class test1 {

    @MyAnnotation2(age = 18,name = "秦将")
    public void test(){

    }
}


@Target(value = {ElementType.TYPE,ElementType.METHOD}) //表示我们的注解可以用在什么地方
@Retention(value = RetentionPolicy.RUNTIME)//表示我们的注解在什么时候还有效
@Inherited //子类可以继承父类的该注解
@interface MyAnnotation{

}


@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface MyAnnotation2{

    String name() default "";
    int age();
    int id() default -1;

    String[] schools() default {"二师","华师"};
}