package com.itheima.day11.charset;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class CharsetDemo {
    public static void main(String[] args) {
        Charset charset = Charset.defaultCharset();
        System.out.println(charset.name());//返回此字符集的规范名称。
        System.out.println(charset.displayName());//返回此字符集的默认区域设置的人类可读名称
//        SortedMap<String, Charset> stringCharsetSortedMap = Charset.availableCharsets();
//        stringCharsetSortedMap.forEach((k, v) -> System.out.println(k + ":" + v));
//        String s = "你好吗";
//        String s = "तपाईंलाई कस्तो छ";
        String s = "Hvordan går det";
//        编码
        byte[] gbks = s.getBytes(Charset.forName("gbk"));
//        解码
        String gbk = new String(gbks, Charset.forName("gbk"));
        System.out.println(gbk);
    }
}
