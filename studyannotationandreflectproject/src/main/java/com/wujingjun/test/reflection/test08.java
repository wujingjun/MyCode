package com.wujingjun.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test08 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.wujingjun.test.reflection.User");

        //获得类的名字
        System.out.println("获得包名+类名:"+c1.getName());//获得包名+类名
        System.out.println("获得类名:"+c1.getSimpleName());//获得类名

        //获得类的属性
        System.out.println("====================");
        Field[] fields = c1.getFields();//
        for (Field field : fields) {
            System.out.println("获得类的属性:"+field);
        }
        //找到全部的属性
        fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("找到全部的属性:"+field);
        }

        //获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println("获得指定属性的值:"+name);

        //获得类的方法
        System.out.println("====================");
        //获得全部public方法
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println("获得全部public方法:"+method.getName());
        }
        //获得全部方法
        Method[] methods1 = c1.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println("获得全部方法:"+method.getName());
        }

        //获得指定方法
        //重载
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println("获得指定方法:"+setName);
        System.out.println("获得指定方法:"+getName);

        //获得指定的构造器
        System.out.println("====================");
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("获得public的构造器:"+constructor);
        }
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println("获得全部的构造器:"+declaredConstructor);
        }

        Constructor declaredConstructor = c1.getDeclaredConstructor(int.class, String.class, int.class);
        System.out.println("获得指定的构造器:"+declaredConstructor);
    }
}
