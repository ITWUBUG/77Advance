package com.itheima.day06.date_1;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
//        1、获取当前操作系统时间
        Date date = new Date();
        System.out.println(date);
//        2、获取当前操作系统毫秒时间戳
        long time = date.getTime();
        System.out.println(time);
        long l = System.currentTimeMillis();
        System.out.println(l);



    }
}
