package com.itheima.day02.ploymorphic;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
