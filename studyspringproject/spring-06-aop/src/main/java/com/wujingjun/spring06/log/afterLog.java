package com.wujingjun.spring06.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class afterLog implements AfterReturningAdvice {

    //returnValue:返回值
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"结果为"+returnValue);
    }
}
