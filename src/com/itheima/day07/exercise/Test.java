package com.itheima.day07.exercise;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Comparator<Student> comparator = (o1,o2)->o2.getTotal().compareTo(o1.getTotal());
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",67,78,80));
        list.add(new Student("李四",87,95,87));
        list.add(new Student("赵四",77,84,90));
        list.sort(comparator);
        list.forEach(System.out::println);
    }
}
