package com.itheima.test;

public class Father {
    int a = 10;
    static int b = 20;
    static {
        System.out.println("father静态代码块");
    }

    {
        System.out.println("father 代码快");
    }

    public Father() {
        System.out.println("Father无参");
    }
}
