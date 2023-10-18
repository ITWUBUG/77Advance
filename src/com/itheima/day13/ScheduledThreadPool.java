package com.itheima.day13;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 定时任务线程池
 * 定时任务：周期性的执行任务
 */
public class ScheduledThreadPool {
    public static void main(String[] args) {
//        定时任务服务类
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        按TimeUnit的单位 延时3 每3 执行一次 任务
        scheduledExecutorService.scheduleAtFixedRate(()-> System.out.println(123)
                ,3,3, TimeUnit.SECONDS);
    }
}
