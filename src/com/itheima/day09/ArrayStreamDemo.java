package com.itheima.day09;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStreamDemo {
    public static void main(String[] args) {
//        Stream流注意点：1.区分中与终：看方法的返回值（如果是XXXStream->中）
//                      2.Stream流不会影响数据源（个数），必须通过终止方法获取结果
//                      3.一旦终止不能开启

        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6};
//        去重
        Arrays.stream(arr).distinct().forEach(System.out::println);
//        开启数组Stream流
        IntStream stream = Arrays.stream(arr);
//        执行中间操作
//        1.distinct去重
        IntStream distinct = stream.distinct();
//        执行终止操作
        distinct.forEach(System.out::println);
//          一旦终止不能开启
//        stream.filter(o->o>3).forEach(System.out::println);

        System.out.println("----------");
//          2.过滤
        Arrays.stream(arr).filter(o -> o > 3).forEach(System.out::println);

        System.out.println("-------------");
//        3.limit 取前几个 skip 跳过前几个
        Arrays.stream(arr).limit(3).forEach(System.out::println);
        Arrays.stream(arr).skip(3).forEach(System.out::println);

        Arrays.stream(arr).limit(3).skip(3).forEach(System.out::println);
        System.out.println("-----------");
//        4.map映射（转换）
        Arrays.stream(arr).map(o -> o + 1).forEach(System.out::println);

        String[] nameArr = {"张三","李四"};
        Arrays.stream(nameArr).map(Teacher::new).forEach(System.out::println);

    }
}
