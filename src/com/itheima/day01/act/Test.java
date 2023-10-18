package com.itheima.day01.act;

public class Test {

    public static void main(String[] args) {
        Human human = new Human("张三", 18, "男");
        human.introduce();

        Actor actor = new Actor("李四", 24, "男", "浙大", "鸡你太美");
        actor.introduce();

        Athlete athlete = new Athlete("王五", 23, "男", "跳远", "第二");
        athlete.introduce();
        
    }
}
