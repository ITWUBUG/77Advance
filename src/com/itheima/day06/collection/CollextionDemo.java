package com.itheima.day06.collection;

import java.util.ArrayList;

public class CollextionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        System.out.println(arrayList);
//        按条件删除
        arrayList.removeIf(t -> t.compareTo(3) > 0);
        System.out.println(arrayList);
//        判断为空
        System.out.println(arrayList.isEmpty());
    }
}
