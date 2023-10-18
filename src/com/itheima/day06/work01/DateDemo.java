package com.itheima.day06.work01;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        String format = "yyyy-MM-dd";
        String s = DateUtil.dateToSting(date, format);
        System.out.println(s);
        Date date1 = DateUtil.parseStr(s, format);
        System.out.println(date1);
    }
}
