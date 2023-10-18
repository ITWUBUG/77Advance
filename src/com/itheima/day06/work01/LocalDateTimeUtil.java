package com.itheima.day06.work01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 日期工具类
 */
public class LocalDateTimeUtil {

    private LocalDateTimeUtil() {
    }


    /**
     * 把日期转换为指定格式的字符串
     *
     * @param localDate 日期
     * @param foematStr 日期的指定格式
     * @return 指定格式的字符串
     */
    public static String dateCastSting(LocalDate localDate, String foematStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(foematStr);
        return localDate.format(dateTimeFormatter);
    }


    /**
     * 把字符串解析为指定格式的日期
     *
     * @param date
     * @param formatStr
     * @return
     */
    public static LocalDate parseStr(String date, String formatStr) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatStr);
        return LocalDate.parse(date, dateTimeFormatter);
    }
}
