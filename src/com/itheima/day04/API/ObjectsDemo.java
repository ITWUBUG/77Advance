package com.itheima.day04.API;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        int[] arr = null;
        sumArr(arr);
    }

    public static void sumArr(int[] arr) {
        if(Objects.isNull(arr)){
            System.out.println("数组值为空");
            return;
        }
        if(Objects.nonNull(arr)){
            System.out.println("数组值不为空");
            return;
        }
    }
}
