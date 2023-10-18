package com.itheima.day06.day05;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,42,35,23,453,24,52,34,5};
        Arrays.sort(arr);
        int i = Arrays.binarySearch(arr, 43);
        System.out.println(i);
        
    }

}
