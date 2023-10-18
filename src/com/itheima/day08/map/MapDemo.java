package com.itheima.day08.map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
//        一人一首代表作
        HashMap<String, String> hashMap = new HashMap<>();
//        增加键值对，修改vlue值
        hashMap.put("蔡徐坤", "基尼太美");
        hashMap.put("周杰伦", "夜曲");
        hashMap.put("周杰伦", "青花瓷");
        hashMap.put("凤凰传奇", "海底");
        hashMap.put("雨神", "王妃");
        String s = hashMap.get("周杰伦");
        System.out.println(s);
//        取不到返回null
        String s1 = hashMap.get("伍佰");
        System.out.println(s1);
        hashMap.remove("蔡徐坤");
        System.out.println(hashMap.containsKey("雨神"));
        System.out.println(hashMap.containsValue("海底"));
        System.out.println(hashMap.size());
        System.out.println(hashMap.get("周杰伦"));
//        map的遍历
//        keySet遍历 -> get
//        先获取key
        System.out.println("-------get--------");
        Set<String> strings = hashMap.keySet();
        strings.forEach(System.out::println);
        strings.forEach(k -> System.out.println(k + "：" + hashMap.get(k)));
//        2.entrySet()直接返回所有的键值对 ->Enstry(Map当中的一个内部接口，实际上就是存放键值对的，getKey getValue)
        System.out.println("--------entrySet---------");
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("-----forEach---------");
//        3.forEach
        hashMap.forEach((k, v) -> System.out.println(k + ":" + v));

        Collection<String> values = hashMap.values();
        values.forEach(System.out::println);

    }
}
