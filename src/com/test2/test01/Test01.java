package com.test2.test01;


import java.text.ParseException;
import java.util.Date;

public class Test01 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        String format = "yyyy-MM-dd HH:mm:ss";
        String s1 = DateUtil.dateToString(date, format);
        System.out.println(s1);
        System.out.println("-----------");

        String s = "2023-10-23 9:59:23";
        Date date1 = DateUtil.stringToDate(s, format);
        System.out.println(date1);


    }
}
