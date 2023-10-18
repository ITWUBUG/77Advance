package com.test2.Test02;

import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String format = "yyyy-MM-dd HH:mm:ss";
        String s = LocalDateTimeUtil.localDateTimeToString(now,format);
        System.out.println(s);
        System.out.println("-------------");

        LocalDateTime localDateTime = LocalDateTimeUtil.stringToLocalDateTime(s,format);
        System.out.println(localDateTime);
    }
}
