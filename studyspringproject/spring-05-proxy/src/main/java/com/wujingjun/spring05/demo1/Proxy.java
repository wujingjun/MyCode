package com.wujingjun.spring05.demo1;

//代理角色：中介
public class Proxy implements Rent {

    private master master;

    public void setMaster(com.wujingjun.spring05.demo1.master master) {
        this.master = master;
    }

    @Override
    public void rent() {
        System.out.print("中介消息：");
        master.rent();
    }
}
