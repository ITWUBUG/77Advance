package com.itheima.day02.exercise4;

public class NewPhone extends CellPhone implements Play {
    /**
     * 打电话
     */
    @Override
    public void call() {
        System.out.println("新手机打电话");

    }

    /**
     * 发短信
     */
    @Override
    public void send() {
        System.out.println("新手机发短信");

    }


    /**
     * 玩游戏
     */
    @Override
    public void play() {
        System.out.println("新手机玩游戏就是好");
    }
}
