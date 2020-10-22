package com.wujingjun.spring05.demo1;

//真实角色：房东
public class master implements Rent {


    @Override
    public void rent() {
        System.out.println("房东有房子租了");
    }
}
