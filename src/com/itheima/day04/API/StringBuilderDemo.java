package com.itheima.day04.API;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
//       附加，拼接
        stringBuilder.append(1).append(1.23);
        System.out.println(stringBuilder);


        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long start1 = System.currentTimeMillis();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            stringBuilder1.append(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);


    }
}
