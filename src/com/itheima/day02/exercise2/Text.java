package com.itheima.day02.exercise2;

public class Text {
    public static void main(String[] args) {
        Fruit fruit = new Apple("红富士苹果","山东烟台",20);
        fruit.bloom();
        fruit.grouwUp();
        fruit.pick();
        FruitUtil.weight(5,fruit);
    }
}
