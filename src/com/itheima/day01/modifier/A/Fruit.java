package com.itheima.day01.modifier.A;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Fruit {
//    默认权限
    String name ;
//    受保护的权限
    protected double price;

    public void weight(double weight){
        double money = price*weight;
        System.out.println(money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
