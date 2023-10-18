package com.itheima.day08.worko1;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        HashMap<String, Set<String>> map = new HashMap<>();
        HashSet<String> brand = new HashSet<>();
        brand.add("电子工业出版社");
        brand.add("异步图书");
        brand.add("清华大学出版社");
        brand.add("文轩");
        map.put("品牌", brand);

        HashSet<String> time = new HashSet<>();
        time.add("往季");
        time.add("2019年春季");
        time.add("2019年冬季");
        time.add("2020年春季");
        time.add("2020年冬季");
        time.add("2021年春季");
        time.add("2021年冬季");
        map.put("上市时间", time);

        HashSet<String> computerAndInternet = new HashSet<>();
        computerAndInternet.add("编程语音与程序设计");
        computerAndInternet.add("网络与通信");
        computerAndInternet.add("数据库");
        computerAndInternet.add("操作系统");
        computerAndInternet.add("移动开发");
        map.put("计算机与互联网", computerAndInternet);

        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.print(string + ":");
            Set<String> strings1 = map.get(string);
            for (String s : strings1) {
                System.out.print(s + "\t");
            }
            System.out.println();
        }
        

    }

}
