package com.itheima.day02.exercise2;

public class Apple extends Fruit{

    public Apple(String type, String localityOfGrowth, double price) {
        super(type, localityOfGrowth, price);
    }

    public Apple() {
    }

    @Override
    public void bloom() {
        System.out.println("苹果开花");
    }

    @Override
    public void grouwUp() {
        System.out.println("苹果结果");

    }

    @Override
    public void pick() {
        System.out.println("苹果人工采摘");

    }

}
