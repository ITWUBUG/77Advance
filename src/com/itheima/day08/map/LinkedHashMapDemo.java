package com.itheima.day08.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
//        读取有序
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("邓超", "孙俪");
        hashMap.put("周杰伦", "昆凌");
        hashMap.put("陈小春", "应采儿");
        hashMap.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}
