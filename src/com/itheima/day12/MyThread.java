package com.itheima.day12;

public class MyThread extends Thread {
    private int order;

    public MyThread(int order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("执行线程" + order);
        System.out.println(Thread.currentThread().getName());
    }
}
