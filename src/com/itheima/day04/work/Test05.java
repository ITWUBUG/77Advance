package com.itheima.day04.work;

import jdk.swing.interop.SwingInterOpUtils;

public class Test05 {
    public static void main(String[] args) {
        String[] arr = {"Abc", "12a", "10", "150", "你好12", "120"};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            try {
                a = Integer.parseInt(arr[i]);
            } catch (NumberFormatException e) {
            }
            sum += a;
        }
        System.out.println(sum);
    }
}
