package com.itheima.day01.Extends;

import jdk.swing.interop.SwingInterOpUtils;

public class Father {
    private String name;
    private int age;
    public int house = 10;
    public String gender = "男";


    public Father(String name, int age, int house) {
        this.name = name;
        this.age = age;
        this.house = house;
        System.out.println("father有参构造");
    }
//
//    public Father() {
//        System.out.println("father无参构造");
//    }

    public void study() {
        System.out.println("father 学习");

    }

    public void sleep(){
        System.out.println("sleep");
    }

    public void work() {
        System.out.println("工作");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }
}
