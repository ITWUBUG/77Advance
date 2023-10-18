package com.itheima.day08.work;

import java.util.StringJoiner;

public class StringJoiners {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
//        String连接器
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        for (int i : arr) {
            stringJoiner.add(String.valueOf(i));

        }
        System.out.println(stringJoiner);
    }
}
