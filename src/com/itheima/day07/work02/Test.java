package com.itheima.day07.work02;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Commodity> set = new HashSet<>();
        set.add(new Commodity(1,"三国",79,"浙江出版社"));
        set.add(new Commodity(2,"西游",87,"浙江出版社"));
        set.add(new Commodity(3,"红楼梦",89,"浙江出版社"));
        set.forEach(System.out::println);
        System.out.println("------------------");


        TreeSet<Commodity> set1 = new TreeSet<>();
        set1.add(new Commodity(1,"三国",79,"浙江出版社"));
        set1.add(new Commodity(2,"西游",87,"浙江出版社"));
        set1.add(new Commodity(3,"红楼梦",89,"浙江出版社"));
        set1.forEach(System.out::println);
    }
}
