package com.itheima.day01.Extends;

import org.w3c.dom.ls.LSOutput;

public class Son extends Father {
    /*
        同：super和this都可以调用构造器、属性和方法
        异：this调用本类构造器，忽略修饰符，必须放在构造器的第一行，只能在构造器里面
            super调用父类构造器，必须放在构造器的第一行，只能在构造器里面

            super调用父类非私有属性和方法
            this调用本类属性和方法

    */



    //    private String name;
//    private int age;
    private String university;
    public String gender = "女";


//    public Son(String name, int age, String university) {
////        this.name = name;
////        this.age = age;
//        super.setName(name);
//        super.setAge(age);
//        this.university = university;
//    }
//
//    public Son() {
//    }


    public Son(String name, int age, int house, String university) {
        super(name, age, house);
        this.university = university;
    }

    public Son(String name, int age, int house) {
        super(name, age, house);
    }

    @Override
    public void study() {
        System.out.println("学习");
        super.study();
        super.sleep();

    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
