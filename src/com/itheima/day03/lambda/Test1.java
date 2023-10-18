package com.itheima.day03.lambda;

public class Test1 {
    public static void main(String[] args) {
//        构造方法引用 类名::new 使用条件
//        1、lambda方法体内只有一条语句，并且这条语句是在调用构造器创建对象
//        2、构造器与接口方法参数一致(个数，类型，顺序)
//        CreateStu createStu = (name, age) -> new Student(name,age);
        CreateStu createStu = Student::new;
        Student student = createStu.create("张三",18);
        System.out.println(student);


//        普通方法引用
//        1、lambda方法体内只有一条语句，并且这条语句是在调用某个对象里的方法
//        2、方法的参数列表，返回值与接口的参数列表以及返回值一致
//        Get get = ()->student.getName();
        Get get = student::getName;
        String s = get.get();
        System.out.println(s);


        int a = 10;
        final int[] b = {20};
//        面向函数的特点
//        1/闭包：lambda表达式访问外部变量的时候，会自动加上final
        SingWithParam singWithParam1 = (song, singer) -> {
//           会自动加上final,不能修改
//            a++;
            b[0]++;
            System.out.println(a);
            System.out.println(b[0]);
            System.out.println(singer + "唱了一首" + song);
        };

//        2、可以把lambda表达式当做参数传递 Test2

    }
}
