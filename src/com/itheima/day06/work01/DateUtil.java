package com.itheima.day06.work01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtil {

    private DateUtil() {
    }


    /**
     * 把日期转换为指定格式的字符串
     *
     * @param date      日期
     * @param formatStr 日期的指定格式
     * @return 指定格式的字符串
     */
    public static String dateToSting(Date date, String formatStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatStr);
        String format = simpleDateFormat.format(date);
        return format;
    }

    /**
     * 把字符串解析为指定格式的日期
     *
     * @param date      日期
     * @param formatStr 日期的指定格式
     * @return 字符串解析的指定格式的日期
     */
    public static Date parseStr(String date, String formatStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatStr);
        Date parse = null;
        try {
            parse = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }
}
