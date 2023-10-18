package com.itheima.day07.set;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
//        HaehSet存的是自定义对象的话，需要重写equals and hashcode
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(100);
        set.add(123);
        set.add(107);
        set.add(12);
        set.add(12);
        set.forEach(System.out::println);
        System.out.println("------------------");
//        hash(哈希)：一种算法，根据此算法能得出任意一个输入的整数值，相同的输入得出的hash值永远一样
//        哈希碰撞：不同的输入得出的哈希值有可能一样 先运行hashcCode 再运行equals hashCode出的值不同在比较equals
        HashSet<BaiduHotSearch> set1 = new HashSet<>();
        set1.add(new BaiduHotSearch("金牌刷榜，中国狂揽11金", 12211));
        set1.add(new BaiduHotSearch("金牌刷榜，中国狂揽11金", 12211));
        set1.add(new BaiduHotSearch("伊朗击败小日子是历史性一刻", 233212));
        set1.add(new BaiduHotSearch("汪顺：谁说我不行", 321323));
        set1.add(new BaiduHotSearch("震惊！！！", 233212));
        set1.forEach(System.out::println);
    }
}
