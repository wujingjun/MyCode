package com.wujingjun.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test09 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("com.wujingjun.test.reflection.User");

        //构造一个对象
        //本质是调用了类的无参构造器
        User user = (User) c1.newInstance();
        System.out.println(user);

        //通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(int.class,String.class,int.class);
        User user1 = (User) constructor.newInstance(1,"wujingjun",18);
        System.out.println(user1);

        //通过反射调用普通方法
        User user2 = (User) c1.newInstance();
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke:激活的意思
        //(对象，形参)
        setName.invoke(user2,"wujingjun");
        System.out.println(user2.getName());

        //通过反射操作属性
        System.out.println("=================================");
        User user3 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");

        //不能直接操作私有属性，我们需要关闭程序的安全检测，属性或者方法的setAccessible(true)
        name.setAccessible(true);

        name.set(user3,"junge");
        System.out.println(user3.getName());
    }
}
