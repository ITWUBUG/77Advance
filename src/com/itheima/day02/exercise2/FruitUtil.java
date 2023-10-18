package com.itheima.day02.exercise2;

public class FruitUtil {

    private FruitUtil() {
    }

    public static void weight(double weight, Fruit fruit) {
        System.out.println(fruit + "重量" + weight + "需要支付：" + weight * fruit.getPrice());
    }
}
