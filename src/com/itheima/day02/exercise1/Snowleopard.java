package com.itheima.day02.exercise1;

/**
 * 雪豹类
 */
public class Snowleopard extends Animal implements Bark {

    /**
     * 无参构造器
     */
    public Snowleopard() {
    }

    /**
     * 叫方法
     */
    @Override
    public void bark() {
        System.out.println("雪豹叫");
    }

    /**
     * 运动方法
     */
    @Override
    public void movement() {
        System.out.println("雪豹跑得快");
    }
}
