package com.test3.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
  /*      1)   请选择合适的io流读取以上数字并存放到合适的集合当中
        2) 请使用stream流统计每一种数字出现的次数并输出（输出格式为数字：次数）
        3) 按照数字出现次数倒序排序,取前2个*/

        try (FileReader reader = new FileReader("res/c.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            StringBuilder stringBuilder = new StringBuilder();
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine());
            }
            String[] split = stringBuilder.toString().split(",");

            List<String> list = Arrays.stream(split)
                    .collect(Collectors.toList());
            list.add("asd");


            Map<String, Integer> collect = list.stream()
                    .collect(Collectors.toMap(key -> key, value -> 1, (a, b) -> a + 1));
            collect.forEach((k, v) -> System.out.println(k + ":" + v));
            System.out.println("------------");

            collect.entrySet().stream()
                    .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                    .limit(2)
                    .forEach(o -> System.out.println(o.getKey() + ":" + o.getValue()));

//            将Map转换成List
            List<Map.Entry<String, Integer>> collect2 = collect.entrySet().stream()
                    .collect(Collectors.toList());
//            按照数字出现次数倒序排序
            Collections.sort(collect2, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
//            取前2个
            collect2.stream()
                    .limit(2)
                    .forEach(o -> System.out.println(o.getKey() + ":" + o.getValue()));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
