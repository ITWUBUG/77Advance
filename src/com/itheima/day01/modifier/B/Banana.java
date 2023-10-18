package com.itheima.day01.modifier.B;

import com.itheima.day01.modifier.A.Fruit;
import org.junit.Test;

public class Banana extends Fruit {

    public void weight(double weight) {
        double money = price * weight;
        System.out.println(money);
    }
}
