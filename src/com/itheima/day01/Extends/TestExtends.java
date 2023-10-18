package com.itheima.day01.Extends;

public class TestExtends {
    public static void main(String[] args) {
//        Son son = new Son("张三",18,"家里顿");
        Son son = new Son("张三", 20, 8);
        son.work();
        son.study();
        System.out.println(son.house);
        System.out.println(son.getName());
        System.out.println(son.getAge());
        System.out.println(son.gender);
        System.out.println("----------------------------------");
        Father father = new Son("张三", 20, 8);
        System.out.println(father.gender);

    }
}