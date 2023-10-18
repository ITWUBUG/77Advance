package com.itheima.day01.exercise2;

import org.junit.Test;

public class CompareAgeUtil {

    public static final int LEGAL_AGE = 18;

    private CompareAgeUtil() {
    }

    public static void compareAge(int age) {
//        System.out.println(age>=18?"成年人":age <= 0 ? "输入错误":"未成年人");
//        魔法值：未经定义，直接写字面量的值
        if (age >= LEGAL_AGE) {
            System.out.println("成年人");
        } else if (age < LEGAL_AGE && age > 0) {
            System.out.println("未成年人");
        } else {
            System.out.println("输入错误");
        }
    }
}
