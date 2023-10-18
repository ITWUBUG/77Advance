package com.itheima.day02.exercise1;

/**
 * 丁真类
 */
public class DinZhen extends People implements Smoke{

    /**
     *speak方法
     */
    @Override
    public void speak() {
        System.out.println("会说藏话");
    }

    /**
     * 通过运动识别动物
     */
    public void listenAnimal(Animal animal) {
        animal.movement();
        if (animal instanceof Lynx) {
            System.out.println("芝士猞猁");
        } else if (animal instanceof Riverdeer) {
            System.out.println("芝士獐子");
        } else if (animal instanceof Snowleopard) {
            System.out.println("芝士雪豹");
        }
    }

    public void listenAnimal(Bark bark) {
        bark.bark();
        if (bark instanceof Lynx) {
            System.out.println("芝士猞猁");
        } else if (bark instanceof Riverdeer) {
            System.out.println("芝士獐子");
        } else if (bark instanceof Snowleopard) {
            System.out.println("芝士雪豹");
        }
    }




    /**
     * 抽烟方法
     */
    @Override
    public void smoke() {
        System.out.println("会抽烟");
    }
}
