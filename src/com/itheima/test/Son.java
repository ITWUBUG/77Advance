package com.itheima.test;

public class Son extends Father{
    static {
        System.out.println("son静态代码块");
    }

    {
        System.out.println("son代码块");
    }

    public Son() {
        System.out.println("son无参");
    }
}
