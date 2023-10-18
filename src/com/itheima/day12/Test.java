package com.itheima.day12;

public class Test {
    public static void main(String[] args) {
        new Thread(()-> System.out.println(1/0)).start();
        new Thread(()-> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(1/0);
        }).start();
        new Thread(()-> System.out.println(1/0)).start();
        System.out.println(1/0);
    }
}
