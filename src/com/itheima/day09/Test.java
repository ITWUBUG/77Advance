package com.itheima.day09;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        list.add(new Phone("苹果", 9500));
        list.add(new Phone("华为", 9000));
        list.add(new Phone("小米", 2000));
        list.add(new Phone("小米", 2000));
        list.stream().filter(o -> o.getPrice() > 3000).forEach(System.out::println);
        double sum = list.stream().mapToDouble(Phone::getPrice).sum();
        System.out.println(sum);
        Double reduce = list.stream().map(Phone::getPrice).reduce(0.0, Double::sum);
        System.out.println(reduce);

//        收集collect操作 需要搭配 Colllectors收集器工具类使用
        List<Phone> collect = list.stream().filter(o -> o.getPrice() > 3000).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("-----------------");
        Set<Phone> collect1 = list.stream().filter(o -> o.getPrice() > 3000).collect(Collectors.toSet());
        collect1.forEach(System.out::println);
        System.out.println("----------1-------");

//        toMap(key lambda,value lambda)
//        Map<String, Double> collect2 = list.stream().collect(Collectors.toMap(key -> key.getBrand(), value -> value.getPrice()));
//        collect2.forEach((k, v) -> System.out.println(k + ":" + v));
//        toMap(key lambda,value lambda,new value lambda[和map的put方法原理])
        Map<String, Phone> collect2 = list.stream().collect(Collectors.toMap(key -> key.getBrand(), value -> value
                , (a, b) -> new Phone("重复", 0)));
        collect2.forEach((k, v) -> System.out.println(k + ":" + v));

//        数据分区
        System.out.println("----------");
        Map<Boolean, List<Phone>> collect3 = list.stream().collect(Collectors.partitioningBy(phone -> {
            if (phone.getPrice() > 3000) {
                return true;
            }
            return false;
        }));
        collect3.forEach((k, v) -> System.out.println(k + ":" + v));

//        数据分组
        Map<String, List<Phone>> collect4 = list.stream().collect(Collectors.groupingBy(phone -> {
            double price = phone.getPrice();
            if (price < 3000) {
                return "3k以下";
            } else if (price >= 3000 && price < 5000) {
                return "3-5k";
            } else {
                return "5k以上";
            }
        }));
        collect4.forEach((k, v) -> System.out.println(k + ":" + v));

//        stream流三大操作
//        1.map 映射（一对一转换）
//        2.reduce 归约。折叠（要满足结合律）
//        3.collect 收集 3.1 to集合 3.2数据分组 Collectors 工具类
    }


}
