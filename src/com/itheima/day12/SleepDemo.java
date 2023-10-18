package com.itheima.day12;

public class SleepDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("123");
        });
        thread.start();
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("456");
        });
        thread1.start();
        System.out.println("789");
    }
}
