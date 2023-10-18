package com.test2.Test02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


/**
 * 时间日期工具类
 */
public class LocalDateTimeUtil {

    private LocalDateTimeUtil() {
    }

    /**
     * 对时间转换为相应的String时间字符串
     * @param localDateTime 时间日期类
     * @param parrent 时间格式字符串
     * @return 相应的String时间字符串
     */
    public static String localDateTimeToString(LocalDateTime localDateTime,String parrent) {
        Objects.requireNonNull(localDateTime,"时间不能为空");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(parrent);
        String dateString = localDateTime.format(dateTimeFormatter);
        return dateString;
    }


    /**
     * 对时间字符串转换为相应的String时间
     * @param dateString 时间字符串
     * @param parrent 时间格式字符串
     * @return 时间日期类
     */
    public static LocalDateTime stringToLocalDateTime(String dateString,String parrent) {
        Objects.requireNonNull(dateString,"时间不能为空");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(parrent);
        return LocalDateTime.parse(dateString,dateTimeFormatter);
    }
}
