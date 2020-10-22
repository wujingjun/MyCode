package com.wujingjun.spring05.demo2;

//代理角色
public class UserServiceProxy implements UserService {

    private UserService userServiceImpl;

    public void setUserService(UserService userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @Override
    public void add() {
        userServiceImpl.add();
        method();
    }

    @Override
    public void delete() {
        userServiceImpl.delete();
        method();
    }

    @Override
    public void update() {
        userServiceImpl.update();
        method();
    }

    @Override
    public void select() {
        userServiceImpl.select();
        method();
    }

    private void method(){
        System.out.println("方法成功执行");
    }

}
