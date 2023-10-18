package com.itheima.day06.day05.work;

public class Test1 {
    public static void main(String[] args) {
        Son son = new Son();
        son.method();
    }
}

class Father {
    public void method() throws ClassCastException {
        System.out.println("f.m");
    }

    public void method1() {
        System.out.println("f.m1");

    }
}

class Son extends Father {
    @Override
    public void method() throws RuntimeException {
        System.out.println("s.m");
    }

    @Override
    public void method1() {
        System.out.println("s.m1");

    }
}