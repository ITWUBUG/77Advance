package com.itheima.day04.work;


import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;

        if (str.isBlank()) {
            System.out.println("请输入正确字符串");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            } else if (Character.isUpperCase(c)) {
                upperCount++;
            }
        }
        System.out.println("该字符串中大写字母字符出现" + upperCount +
                "次\t小写字母字符出现" + lowerCount + "次\t该字符串中数字字符出现" + digitCount + "次");

    }
}
