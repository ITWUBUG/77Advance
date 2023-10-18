package com.itheima.day12;

public class TestDaemon {
    public static void main(String[] args) {
        new Thread(()->{
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("123");
        }).start();
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("456");
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

}
