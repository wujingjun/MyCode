package com.wujingjun.spring05.demo2;

//客户
public class client {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        UserServiceProxy userServiceProxy = new UserServiceProxy();

        userServiceProxy.setUserService(userService);

        userServiceProxy.select();
    }

}
