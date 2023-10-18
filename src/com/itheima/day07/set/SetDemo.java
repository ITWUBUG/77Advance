package com.itheima.day07.set;

import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        set特点：存取不一致，去重，无索引
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(12);
        set.add(6);
        set.add(35);
        set.add(14);
        set.add(23);
        set.forEach(System.out::println);
    }

}
