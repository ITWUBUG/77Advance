package com.itheima.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建缓存线程池（无休止创建线程 最大Integer.MAX_VALUE）不推荐
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        while(true){
            executorService.submit(()->{
                try {
                    Thread.sleep(10*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
