package com.itheima.day13.work;

import com.itheima.day13.FixedThreadPool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo01 {
    public static void main(String[] args) {

//        使用默认线程池
        ExecutorService executorService = Executors.newFixedThreadPool(8 * 2);
        AtomicInteger atomicInteger = new AtomicInteger();
        for (int i = 0; i < 100; i++) {
            executorService.submit(()-> System.out.println("第"+atomicInteger.incrementAndGet()+"人核酸检测完毕"));
        }
        executorService.shutdown();
//        使用手动指定参数线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 8 * 2
                , 5, TimeUnit.MINUTES, new ArrayBlockingQueue(1000), new ThreadPoolExecutor.AbortPolicy());
        AtomicInteger atomicInteger1 = new AtomicInteger();
        for (int i = 0; i < 100; i++) {
            threadPoolExecutor.submit(()->System.out.println("第"+atomicInteger1.incrementAndGet()+"人核酸检测完毕"));
        }
        threadPoolExecutor.shutdown();


    }

}
