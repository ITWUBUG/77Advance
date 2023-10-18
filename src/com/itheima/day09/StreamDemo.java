package com.itheima.day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(2);
        list1.add(2);
        Stream<Integer> stream = list.stream();
        Stream<Integer> stream1 = list1.stream();
//        拼接流
        Stream.concat(stream,stream1).forEach(System.out::println);
//        平行流(极大地体改cpu核数的利用率,数据顺序不敏感的情况下)
        Integer reduce = list.stream().reduce(0, Integer::sum);
        Integer reduce1 = list.parallelStream().reduce(0, Integer::sum);
        System.out.println(reduce);
        System.out.println(reduce1);

    }
}
