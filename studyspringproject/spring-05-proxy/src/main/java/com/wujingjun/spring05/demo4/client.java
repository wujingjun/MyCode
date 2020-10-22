package com.wujingjun.spring05.demo4;

import com.wujingjun.spring05.demo2.UserService;
import com.wujingjun.spring05.demo2.UserServiceImpl;

public class client {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        proxyInvocationHandler.setTarget(userService);

        UserService userService1 = (UserService) proxyInvocationHandler.getProxy();

        userService1.add();
    }
}
