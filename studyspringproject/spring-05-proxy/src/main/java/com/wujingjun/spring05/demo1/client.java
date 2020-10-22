package com.wujingjun.spring05.demo1;

public class client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        master master = new master();
        proxy.setMaster(master);
        proxy.rent();
    }
}
