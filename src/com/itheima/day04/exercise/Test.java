package com.itheima.day04.exercise;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String s = "1 2 3 4 5 6";
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];
        ArrayList<Integer> integers = new ArrayList<>();


        for (int i = 0; i < s1.length; i++) {
            int i1 = Integer.parseInt(s1[i]);
            arr[i] = i1;
            Integer integer = Integer.valueOf(s1[i]);
            integers.add(integer);
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println(integers);



    }
}
