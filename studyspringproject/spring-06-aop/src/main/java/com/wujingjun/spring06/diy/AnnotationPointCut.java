package com.wujingjun.spring06.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.wujingjun.spring06.service.UserServiceImpl.*(..)))")
    public void before(){
        System.out.println("======执行方法前======");
    }

    @After("execution(* com.wujingjun.spring06.service.UserServiceImpl.*(..)))")
    public void after(){
        System.out.println("======执行方法后======");
    }

    @Around("execution(* com.wujingjun.spring06.service.UserServiceImpl.*(..)))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕后");
    }

}
