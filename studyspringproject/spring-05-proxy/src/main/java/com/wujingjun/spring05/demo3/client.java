package com.wujingjun.spring05.demo3;

public class client {

    public static void main(String[] args) {
        //真实角色
        master master = new master();

        //代理角色：现在没有
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        //通过调用程序处理角色来处理我们要调用的接口对象
        proxyInvocationHandler.setRent(master);

        //返回代理对象
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();

        proxy.rent();
    }
}
