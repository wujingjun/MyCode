package com.wujingjun.test.annotation;

import java.util.ArrayList;
import java.util.List;

public class test0 {

    //一个方法声明打算重写超类中的另一个方法声明
    @Override
    public String toString() {
        return super.toString();
    }

    //不推荐程序员使用，但是可以使用，或者存在更好的方式
    @Deprecated
    public static void test(){
        System.out.println("fuck");
    }

    public static void main(String[] args) {
        test();
    }

    //抑制编译时的警告信息
    @SuppressWarnings("all")
    public void test1(){
        List list = new ArrayList();
    }
}
