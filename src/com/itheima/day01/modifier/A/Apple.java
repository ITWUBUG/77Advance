package com.itheima.day01.modifier.A;

public class Apple extends Fruit{
    public void weight(double weight){
        double money = price*weight;
        System.out.println(money);
    }
}
