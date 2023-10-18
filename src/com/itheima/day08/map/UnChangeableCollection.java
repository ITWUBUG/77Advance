package com.itheima.day08.map;

import java.util.List;
import java.util.Set;

public class UnChangeableCollection {
    public static void main(String[] args) {
        List<String> of = List.of("♠" + "♥" + "♦" + "♣");
        of.add("大王");
//        jdk中有大量不可变集合，怎么识别 ->报UnsupportedOperationException不支持的操作异常
        of.forEach(System.out::println);
//       传入重复的数据报错 IllegalArgumentException
        Set<Integer> integers = Set.of(1, 2, 3, 4, 5);
        integers.forEach(System.out::println);
//        HashSet是怎么实现的
//        通过HashMap实现，HashSet所有的方法都是调用HashMap的方法，把值当成了HashMap的键

//        你在工作中会不会自定义HashMap的初始容量??

    }
}
