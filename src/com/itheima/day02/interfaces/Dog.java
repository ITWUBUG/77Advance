package com.itheima.day02.interfaces;

public class Dog extends Animal implements WatchDoor,Bite{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void watchDoor() {
        System.out.println("狗看门");
    }

    @Override
    public void bite() {
        System.out.println("会咬人");
    }
}
