package com.itheima.day08.map;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(3);
        list.add(5);
        list.forEach(System.out::println);
        System.out.println("-------------");
//        排序
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println("-------------");
//        集合反转
        Collections.reverse(list);
        list.forEach(System.out::println);
        System.out.println("-------------");
//        打乱集合顺序
        Collections.shuffle(list);
        list.forEach(System.out::println);

    }
}