package com.wujingjun.test.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class test11 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.wujingjun.test.reflection.Student1");

        //通过反射获得类上的注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        Annotation[] declaredAnnotations = c1.getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println(declaredAnnotation);
        }

        System.out.println("========================");

        //通过反射获得属性上的注解
        Field[] declaredFields = c1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
            Annotation[] annotations1 = declaredField.getAnnotations();
            for (Annotation annotation : annotations1               ) {
                System.out.println(annotation);
            }
        }

        System.out.println("========================");

        //获得注解的value的值
        Tableannotation tableannotation = (Tableannotation) c1.getAnnotation(Tableannotation.class);
        String value = tableannotation.value();
        System.out.println(value);

        //获得类指定的注解
        Field name = c1.getDeclaredField("name");
        Fieldannotation annotation = name.getAnnotation(Fieldannotation.class);
        System.out.println(annotation.name());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }

}
