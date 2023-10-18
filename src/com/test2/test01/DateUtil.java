package com.test2.test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


/**
 * 时间工具类
 * 1.0 线程不安全 1.8线程不安全
 */
public class DateUtil {

    private DateUtil() {
    }


    /**
     * 时间转字符串
     * @param date 时间
     * @param format 格式
     * @return 时间对应的字符串
     */
    public static String dateToString(Date date,String format) {
        Objects.requireNonNull(date,"时间不能为空");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String dateString = simpleDateFormat.format(date);
        return dateString;
    }

    /**
     * 可以把任意时间字符串转换为相应的Date
     * @param dateString 时间字符串
     * @return 相应的Date
     * @throws ParseException 解析异常
     */
    public static Date stringToDate(String dateString ,String format)  {
        Objects.requireNonNull(dateString,"时间不能为空");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date parse = null;
        try {
            parse = simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;

    }

}
