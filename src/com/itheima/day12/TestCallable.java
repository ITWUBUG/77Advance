package com.itheima.day12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args) {
        Walllet walllet = new Walllet(1000, "张三");
//        搭桥创建线程
        MyCallable myCallable = new MyCallable(walllet);
        FutureTask<Walllet> wallletFutureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(wallletFutureTask);
        thread.start();
        try {
            Walllet walllet1 = wallletFutureTask.get();
            System.out.println(walllet1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
//        1.使用目的：拿到线程执行的结果
//        2.创建方式：搭桥
//        3.获取结果：get（阻塞方法：会阻塞程序运行）

//        Future:异步

    }
}
