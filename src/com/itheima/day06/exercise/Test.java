package com.itheima.day06.exercise;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 21));
        list.add(new Student("刘", 18));
        list.add(new Student("刘秀", 23));
        list.add(new Student("刘鹏程", 15));
        list.add(new Student("老刘", 23));

//        内部迭代 不需要写for循环已经在内部循环
        list.removeIf(t -> t.getName().startsWith("刘"));
//        System.out.println(list);
//        接口Iterable中的针对单列集合遍历的(循环)方法
//        list.forEach(student-> System.out.println(student));
        list.forEach(System.out::println);
    }
}
