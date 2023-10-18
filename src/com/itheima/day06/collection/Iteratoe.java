package com.itheima.day06.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratoe {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//        1、获取迭代器
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
//            2、调用next()获取元素
//            System.out.println(iterator.next());
            Integer next = iterator.next();
            if (next.compareTo(3) > 0) {
                iterator.remove();
            }
        }
        list.removeIf(integer -> integer.compareTo(3) > 0);
        list.forEach(System.out::println);
    }
}
