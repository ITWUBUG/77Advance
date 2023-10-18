package com.itheima.day02.ploymorphic;

public class Cat extends Animal{

    public String type = "英短";

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchFish(){
        System.out.println("捉鱼");
    }
    public void climbTree(){
        System.out.println("爬树");
    }
}
