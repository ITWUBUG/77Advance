package com.itheima.day06.work01;

import java.time.LocalDate;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDate of = LocalDate.of(2023, 11, 11);
        String format = "yyyy-MM-dd";
        String s = LocalDateTimeUtil.dateCastSting(of, format);
        System.out.println(s);
        LocalDate localDate = LocalDateTimeUtil.parseStr(s, format);
        System.out.println(localDate);

    }
}
