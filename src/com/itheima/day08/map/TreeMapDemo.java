package com.itheima.day08.map;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
//        根据键排序的map
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "1");
        map.put(12, "1");
        map.put(14, "1");
        map.put(7, "1");
        map.put(5, "1");
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
