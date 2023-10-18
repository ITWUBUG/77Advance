package com.itheima.day06.collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
//        菱形推断语法 ：后面的泛型中不需要添加类型
        ArrayList<Integer> objects = new ArrayList<>();
//        增加add
        objects.add(1);
        objects.add(2);
//        删除remove
        objects.remove(0);
//        改set
        objects.set(0,23);
//        查get
        System.out.println(objects.get(0));

    }
}
