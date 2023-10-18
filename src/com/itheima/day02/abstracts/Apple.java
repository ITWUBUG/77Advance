package com.itheima.day02.abstracts;

import java.io.Serializable;

public class Apple extends Fruit{


    @Override
    public void transport() {
        System.out.println("卡车运输");
    }
}
