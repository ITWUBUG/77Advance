package com.itheima.day08.map;

import java.util.HashMap;

public class MapDemo01 {
    public static void main(String[] args) {
//        一夫一妻
        HashMap<String, String> hashMap = new HashMap<>();
//        增加键值对，修改vlue值
        hashMap.put("邓超", "孙俪");
        hashMap.put("周杰伦", "昆凌");
        hashMap.put("陈小春", "应采儿");
//        如果不存在就添加
        hashMap.putIfAbsent("邓超","张三");
        hashMap.forEach((k,v)-> System.out.println(k+":"+v));
//        如果不存在使用默认值
//        如果不存在就使用默认值
        String orDefault = hashMap.getOrDefault("李四", "张三");
        System.out.println(orDefault);
        String s = hashMap.get("李四");
        System.out.println(s);



    }
}
