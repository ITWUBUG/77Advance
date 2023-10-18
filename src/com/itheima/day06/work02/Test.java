package com.itheima.day06.work02;

public class Test {
    public static void main(String[] args) {
        Game game = new Game();
         game.addNames(new Person("郭靖"));
         game.addNames(new Person("黄蓉"));
         game.addNames(new Person("黄药师"));
         game.addNames(new Person("老顽童"));
         game.addNames(new Person("瑛姑"));
         game.start();
    }
}
