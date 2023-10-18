package com.itheima.day01.Override;

public class Tiger extends Animal{
    public Tiger(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("老虎吃肉");
    }
}
