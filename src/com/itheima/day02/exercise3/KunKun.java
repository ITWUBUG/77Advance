package com.itheima.day02.exercise3;

public class KunKun extends Human implements IkunAction {

    public KunKun(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("唱鸡你太美");
    }

    @Override
    public void dance() {
        System.out.println("跳舞");
    }

    @Override
    public void rap() {
        System.out.println("说唱");
    }

    public void playBasketBall() {
        System.out.println("打篮球");
    }
}
