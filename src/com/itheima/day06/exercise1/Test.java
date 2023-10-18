package com.itheima.day06.exercise1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",18,"黑马"));
        list.add(new Student("李四",18,"黑马"));
        list.add(new Student("王五",18,"黑马"));
        list.add(new Student("刘老板",18,"黑马"));
        list.forEach(System.out::println);
        for (Student student : list) {
            student.setSchool("黑马69期");
        }
        list.removeIf(student -> "刘老板".equals(student.getName()));
        list.forEach(System.out::println);
    }
}
