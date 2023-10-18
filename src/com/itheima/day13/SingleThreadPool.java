package com.itheima.day13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 单线程池 线程池都是懒加载的 不提交任务不创建线程
 */
public class SingleThreadPool {
    public static void main(String[] args) {
//        线程执行服务对象
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(()->{
            System.out.println("执行任务1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.submit(()->System.out.println("执行任务2"));
        executorService.submit(()->System.out.println("执行任务3"));
        executorService.submit(()->System.out.println("执行任务4"));
        executorService.submit(()->System.out.println("执行任务5"));
        Future<Integer> submit = executorService.submit(() -> {
            return 1;
        });
        try {
            System.out.println(submit.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
