package com.itheima.day02.exercise1;

/**
 * 獐子类
 */
public class Riverdeer extends Animal implements Bark  {

    /**
     * 无参构造器
     */
    public Riverdeer() {
    }

    /**
     * 叫方法
     */
    @Override
    public void bark() {
        System.out.println("獐子叫");
    }


    /**
     * 运动方法
     */
    @Override
    public void movement() {
        System.out.println("獐子跑得快");
    }
}
