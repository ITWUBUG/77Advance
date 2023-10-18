package com.itheima.day13.work;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo02 {
    public static void main(String[] args) {
//        定时向客户推送活动促销邮件，每周推送一次
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(8 * 2);
        scheduledExecutorService.scheduleAtFixedRate(
                () -> System.out.println("活动促销邮件"), 0, 7, TimeUnit.DAYS);

    }
}
