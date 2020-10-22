package com.wujingjun.test.reflection;


/**
 * 1.加载到内存，会产生一个类对应class对象
 * 2.链接，链接结束后 m = 0
 * 3.初始化
 *         <clinit>(){
 *             system.out.println("A类静态代码块初始化");
 *             m = 300;
 *             m = 100;
 *         }
 *
 */
public class test05 {

    static {
        System.out.println("卧槽");
    }


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //先执行b的静态代码块，然后是c的静态代码块
        Class c = Class.forName("com.wujingjun.test.reflection.c");
        //先执行b的构造器，然后是c的构造器
        c c1  = (com.wujingjun.test.reflection.c) c.newInstance();
//        /**
//         * 1.加载到内存，会产生一个类对应class对象
//         * 2.链接，链接结束后 m = 0
//         * 3.初始化
//         *         <clinit>(){
//         *             system.out.println("A类静态代码块初始化");
//         *             m = 300;
//         *             m = 100;
//         *         }
//         *
//         */
        A a = new A();
        System.out.println(a.m);
        System.out.println(c1.num);//利用子类调用父类的静态变量，不是主动使用
        System.out.println(b.num);//直接调用静态变量不是主动使用
    }
}

class A{

    static{
        System.out.println("A类静态代码块初始化");
        m = 300;
    }

    static int m =100;

    public A(){
        System.out.println("A类的无参构造初始化");
    }

}

class b{

    static int num = 1;

    public b(){
        System.out.println("b的无参");
    }

    static {
        System.out.println("b");
    }

    public static void testb(){
        System.out.println("testb");
    }
}

class c extends b{

    public c(){
        System.out.println("c的无参");
    }

    static {
        System.out.println("c");
    }
}


