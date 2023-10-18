package com.itheima.day06.collection;

import java.util.ArrayList;

/**
 * 增强for
 * @author admin
 */
public class EnhanceFor {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//        for:  foreach
//        i : index
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("---------------------");
        int[] arr = {1,2,3,4,6};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
