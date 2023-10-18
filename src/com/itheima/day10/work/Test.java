package com.itheima.day10.work;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {
        try (FileInputStream fi = new FileInputStream("res/work.txt");
             BufferedInputStream bi = new BufferedInputStream(fi)) {
            byte[] bytes = new byte[1024];
            int read;
            StringBuilder stringBuilder = new StringBuilder();
            while ((read = bi.read(bytes, 0, bytes.length)) != -1) {
                stringBuilder.append(new String(bytes, 0, read));
            }
            String[] split = stringBuilder.toString().split(",");
            Map<String, Integer> collect = Arrays.stream(split).
                    collect(Collectors.toMap(key -> key, value -> 1, (o1, o2) -> o1 + 1));
            collect.forEach((k, v) -> System.out.println(k + ":" + v));
            List<Map.Entry<String, Integer>> collect1 = collect.entrySet().stream().collect(Collectors.toList());
            System.out.println("--------------");
            collect1.forEach(System.out::println);
            collect1.sort(((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
            System.out.println("--------------");
            collect1.stream().limit(4).forEach(System.out::println);




        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
