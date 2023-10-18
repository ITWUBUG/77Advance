package com.itheima.day07.work;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
//        Comparator<Student> comparator = (student1, student2) -> student1.getAge() - student2.getAge() == 0 ?
//                student1.getName().compareTo(student2.getName()) : student2.getAge() - student1.getAge();
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("张三",12));
        set.add(new Student("张三",15));
        set.add(new Student("张三",17));
        set.add(new Student("张三",14));
        set.forEach(System.out::println);
    }
}
