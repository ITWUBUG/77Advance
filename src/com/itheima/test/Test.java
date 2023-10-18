package com.itheima.test;

public class Test {
    public static void main(String[] args) {

        Son son = new Son();
        String a = "1 2 3 4 5 6";
        String[] s = a.split(" ");
        System.out.println(s.length);
        int[] arr =new int[6];
        for (int i = 0; i < s.length; i++) {
            int i1 = Integer.parseInt(s[i]);
            arr[i] = i1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }
}
