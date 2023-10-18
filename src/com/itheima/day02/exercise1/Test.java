package com.itheima.day02.exercise1;

public class Test {
    public static void main(String[] args) {

        DinZhen dinZhen = new DinZhen();

        Animal a1 = new Lynx();
        dinZhen.listenAnimal(a1);
        Animal a2 = new Riverdeer();
        dinZhen.listenAnimal(a2);
        Animal a3 = new Snowleopard();
        dinZhen.listenAnimal(a3);

        Bark bark1 = new Lynx();
        dinZhen.listenAnimal(bark1);
        Bark bark2 = new Riverdeer();
        dinZhen.listenAnimal(bark2);
        Bark bark3 = new Snowleopard();
        dinZhen.listenAnimal(bark2);
    }
}

