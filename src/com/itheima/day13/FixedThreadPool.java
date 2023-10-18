package com.itheima.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 固定数量线程池（内存泄漏->到一定时候内存溢出）
 * 1.会计算线程的个数
 * 2.引发的问题
 * 三种创建线程池的场景：任务不耗时，任务不频繁
 *
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 2; i++) {
            executorService.submit(()->{
                System.out.println(123);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executorService.submit(()-> System.out.println(123));
        }
    }
}
