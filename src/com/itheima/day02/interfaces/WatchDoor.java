package com.itheima.day02.interfaces;

public interface WatchDoor {

//    接口中的成员变量都被final以及public以及static隐式修饰,即都为常量
    int HOUR = 24;


//    接口中的方法是默认被public 以及 abstract修饰
    void watchDoor();

//    默认方法：default
    default void method(){
        System.out.println("默认方法");
    };
//    静态方法
    static void method1(){
        System.out.println("静态方法");

    };
//    私有方法
    private void method2(){
        System.out.println("私有方法");

    };

}
