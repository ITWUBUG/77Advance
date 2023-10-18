package com.itheima.day08.work03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        ArrayList<Map<String, String>> list = new ArrayList<>();
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("孙策", " 大乔");
        map1.put("周瑜", " 小乔");
        list.add(map1);

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("郭靖", "黄蓉");
        map2.put("杨过", " 小龙女");
        list.add(map2);

        HashMap<String, String> map3 = new HashMap<>();
        map3.put("令狐冲", "任盈盈");
        map3.put("林平之", "岳灵珊");
        list.add(map3);

        list.forEach(map -> map.forEach((k, v) -> System.out.println(k + "\t" + v)));

    }
}
