package com.itheima.day06.date_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class  SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss：SSS");
//        创建简单日期格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH：mm：ss：SSS");
//        将时间类解析成规定格式
        String format = simpleDateFormat.format(date);
        System.out.println(format);
//        String s = "2029年09月18日";
        String s = "2029/09/18 12：12：12：12";
//        把时间日期字符串解析为Date对象
        try {
//            1、parse方法声明了编译异常ParseException
//            2、提供的时间日期字符串要比pattern要详细
            Date parse = simpleDateFormat.parse(s);
            System.out.println(parse);
            System.out.println(parse.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
