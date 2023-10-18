package com.itheima.day02.exercise1;

/**
 * 猞猁类
 */
public class Lynx extends Animal implements Bark {
    /**
     * 无参构造器
     */
    public Lynx() {
    }

    /**
     * 叫方法
     */
    @Override
    public void bark() {
        System.out.println("猞猁叫");
    }


    /**
     * 运动方法
     */
    @Override
    public void movement() {
        System.out.println("猞猁跑得快");
    }
}
