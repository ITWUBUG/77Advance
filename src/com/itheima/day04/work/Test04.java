package com.itheima.day04.work;

public class Test04 {
    public static String splicingInt(int[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(Integer.toString(arr[i]));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(splicingInt(arr));
    }
}
