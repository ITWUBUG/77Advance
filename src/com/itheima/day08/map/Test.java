package com.itheima.day08.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("告白气球");
        arrayList.add("晴天");
        arrayList.add("稻香");
        arrayList.add("夜曲");

        map.put("周杰伦", arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("千里之外");
        arrayList1.add("一剪梅");
        arrayList1.add("梦驼铃");

        map.put("费玉清", arrayList1);

        map.forEach((k, v) -> System.out.println(k + ":" + v));

        ArrayList<List <String>> list1 = new ArrayList<>();
        ArrayList<HashMap<String, List<String>>> list = new ArrayList<>();
    }
}
