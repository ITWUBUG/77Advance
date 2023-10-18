package com.itheima.day08.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
//元注解 用在注解上
@Target(ElementType.TYPE)//指明注解在哪里使用
@SuppressWarnings("all")
public @interface MyAnnotation {
    public String email() default "151@qq.com";

    int[] arr() default {1,2,3,4};

    long  height()default 120;
//    如果使用时只需要给value属性赋值，value就可以省略
    String value();
}
