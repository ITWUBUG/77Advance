package com.itheima.day13;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1.会计算非核心
 * 2.最大存在任务
 * 3.拒绝时机
 */
public class ManualPool {
    public static void main(String[] args) {
//        ArrayBlockingQueue：有界阻塞队列
//        LinkedBlockingQueue:无界阻塞队列（内存泄漏->到一定时候内存溢出）
//        最大线程数量 = 核数 * 2
//        任务类型划分： CPU密集型 内存密集型
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2
                , 5, TimeUnit.MINUTES, new ArrayBlockingQueue<>(3), new ThreadPoolExecutor.AbortPolicy());
        AtomicInteger index = new AtomicInteger();
        for (int i = 0; i < 6; i++) {
            threadPoolExecutor.submit(()-> System.out.println("执行任务"+index.getAndIncrement()));
        }

    }
}
