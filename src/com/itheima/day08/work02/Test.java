package com.itheima.day08.work02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Set<String>> map = new HashMap<>();
        HashSet<String> computer = new HashSet<>();
        computer.add("华为电脑");
        computer.add("苹果电脑");
        computer.add("oppo电脑");
        computer.add("vivo电脑");
        computer.add("三星电脑");
        map.put("电脑",computer);

        HashSet<String> phone = new HashSet<>();
        phone.add("华为手机");
        phone.add("苹果手机");
        phone.add("oppo手机");
        phone.add("vivo手机");
        phone.add("三星手机");
        map.put("手机",phone);

        HashSet<String> earphone = new HashSet<>();
        earphone.add("华为耳机");
        earphone.add("苹果耳机");
        earphone.add("华强北耳机");
        earphone.add("oppo耳机");
        earphone.add("三星耳机");
        earphone.add(" vivo耳机");
        map.put("耳机",earphone);

        map.forEach((o1,o2)-> System.out.println(o1+"="+o2));

    }
}
