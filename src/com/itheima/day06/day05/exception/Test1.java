package com.itheima.day06.day05.exception;

import java.io.FileNotFoundException;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        formatString("12a");
        method2();

    }

    public static Integer formatString(String value) throws FileNotFoundException {
//        1、声明throws使用在方法定义上
//        2、可以声明多个用,隔开
//        3、如果声明了编译异常，方法调用者也得在方法签名上继续声明
        Integer integer = Integer.valueOf(value);
        return integer;
    }
    public static void method()throws FileNotFoundException{

    }
    public static void method1() throws FileNotFoundException {
        method();
    }
    public static void method2() throws FileNotFoundException {
        method1();
    }
}
