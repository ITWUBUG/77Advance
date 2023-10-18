package com.itheima.day01.Static;

/**
 * 工具类
 * 1.工具类应当以Util(s)结尾
 * 2.工具类的构造器应当私有化
 */
public class WeightUtil {
    private WeightUtil() {
    }

    public static void weigh(double price, double weight) {
        System.out.println(price * weight);
    }
}
