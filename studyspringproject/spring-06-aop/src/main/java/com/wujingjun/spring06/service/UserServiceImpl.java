package com.wujingjun.spring06.service;

//真实角色
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加");
    }

    @Override
    public void delete() {
        System.out.println("减少");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void select() {
        System.out.println("查询");
    }
}
