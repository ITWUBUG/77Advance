package com.itheima.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Test {
    public static void main(String[] args) {
//        如何创建线程安全的集合? 主要针对集合的增删改操作
//        双列:
        ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap<>();
//        单列:Collections.synchronizedXXX
        ArrayList<Object> objects1 = new ArrayList<>();
        List<Object> objects = Collections.synchronizedList(objects1);




    }
}
