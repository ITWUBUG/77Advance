package com.itheima.day06.date_8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
//        1、获取当前操作系统时间
        System.out.println("----------------");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
//        2.时间日期格式化
        System.out.println("----------------");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(("yyyy/MM/dd HH:mm:ss"));
        String format = now.format(dateTimeFormatter);
        System.out.println(format);
//        3、把时间字符串解析成相应的LocalDateTime/LocalDate/LocalTime
        System.out.println("----------------");
        String s = "2200/09/23 10:52:46";
        LocalDateTime parse = LocalDateTime.parse(s, dateTimeFormatter);
        System.out.println(parse);
//        4、其他方法
//        静态of方法 自定义时间日期
        System.out.println("----------------");
        LocalDateTime of = LocalDateTime.of(2050, 1, 23, 11, 11, 23);
        LocalTime of1 = LocalTime.of(11, 13, 23);
        LocalDate of2 = LocalDate.of(2030, 2, 18);
//        成员方法： 加plus 减minus
        System.out.println("----------------");
        LocalDateTime localDateTime = of.plusDays(1);
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = of.minusHours(2);
        System.out.println(localDateTime1);
//       比较时间 compareTo isAfter/isBefore /isEquals
        boolean after = of.isAfter(localDateTime);
        System.out.println(after);
//        一些列get方法 单独获取年月日时分秒
        System.out.println(of.getHour());
    }
}
