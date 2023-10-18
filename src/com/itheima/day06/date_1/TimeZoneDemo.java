package com.itheima.day06.date_1;

import java.util.TimeZone;

public class TimeZoneDemo {
    public static void main(String[] args) {
        TimeZone aDefault = TimeZone.getDefault();
        System.out.println(aDefault);
//        获取时间标准
        System.out.println(aDefault.getDisplayName());
//        获取地区时间
        System.out.println(aDefault.getID());

    }
}
