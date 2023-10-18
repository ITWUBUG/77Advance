package com.itheima.day08.map;

import java.util.Set;

public class ChangableParam {
    public static void main(String[] args) {
        sum(1,2,3,4,5);
    }

//    可变参数
    public static void sum(int a, int... b) {
        System.out.println(a);
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        System.out.println(sum);

    }
}
