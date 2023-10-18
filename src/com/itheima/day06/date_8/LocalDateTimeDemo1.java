package com.itheima.day06.date_8;

import com.itheima.day06.date_1.SimpleDateFormatDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeDemo1 {
    public static void main(String[] args) {
//        获取当前时间 时刻类
        Instant now1 = Instant.now();
//        1.8转时间戳 要使用时刻类 Instant (与时区无关)
        LocalDateTime localDateTime = LocalDateTime.of(2050, 1, 23, 11, 11, 23);
        LocalDateTime now = LocalDateTime.now();
//        调用toInstant
        Instant instant = localDateTime.toInstant(ZoneOffset.UTC);
//        获取毫秒戳
        System.out.println(instant.toEpochMilli());
//        获取秒戳
        System.out.println(instant.getEpochSecond());
//        计算两时间差值
        Duration between = Duration.between(now, localDateTime);
        System.out.println(between.toDays());
        System.out.println("=================");
//        1.0和1.8必须掌握的三个问题
//        1.获取当前时间
        Date date = new Date();

        LocalDateTime now2 = LocalDateTime.now();

//        2.字符串与时间日期的相互转化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String format1 = now2.format(dateTimeFormatter);
        System.out.println(format1);

        System.out.println("=======================");
        String s = "2030/10/23 11:20:15";
        try {
            Date parse = simpleDateFormat.parse(s);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        LocalDateTime parse = LocalDateTime.parse(s, dateTimeFormatter);
        System.out.println(parse);

//        3.获取时间日期的时间戳
        System.out.println("----------------");
        long time = date.getTime();
        System.out.println(time);

        Instant instant1 = now2.toInstant(ZoneOffset.UTC);
        long l = instant1.toEpochMilli();
        System.out.println(l);
        long epochSecond = instant1.getEpochSecond();
        System.out.println(epochSecond);

    }
}
