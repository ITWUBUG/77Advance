package com.itheima.day03.lambda;

import com.itheima.day02.exercise3.Sing;

public class TestLambda {
    public static void main(String[] args) {
//        匿名内部类实现接口
        Sing sing = new Sing() {
            String song ="千里之外" ;
            @Override
            public void sing() {
                System.out.println(song);
            }
        };
        sing.sing();

//        lambda实现接口
        Sing sing1 = () -> {
            System.out.println("唱");
        };
        sing1.sing();
        /*
         * 匿名内部类与lambda的区别
         * 1.匿名内部类 是一个类，最终会被编译成class文件
         * 2.lambda表达式是一个方法，代表接口中的方法
         * 3.使用前提不一样：匿名内部类：普通类，抽象类，接口
         *                lambda：只能是接口，接口中还只能有一个抽象方法
         * jdk8之后，为了使用引入的lambda表达式，大部分接口只有一个抽象方法
         */

    }
}
