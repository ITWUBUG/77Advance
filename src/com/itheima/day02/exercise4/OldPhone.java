package com.itheima.day02.exercise4;

public class OldPhone extends CellPhone {
    /**
     * 打电话
     */
    @Override
    public void call() {
        System.out.println("打电话");
    }

    /**
     * 发短信
     */
    @Override
    public void send() {
        System.out.println("发短信");

    }
}
