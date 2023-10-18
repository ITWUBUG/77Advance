package com.itheima.day07.set;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
//        如果同时使用两种排序方法，构造器比较器优先于Comparable接口
//        两种排序方式
//        1.实现Comparable接口并重写接口的compareTo方法
//        2.构造器传入比较器排序
        Comparator<BaiduHotSearch> comparator = (o1, o2) -> o2.getClick()- o1.getClick();
        TreeSet<BaiduHotSearch> set = new TreeSet<>(comparator);
        set.add(new BaiduHotSearch("金牌刷榜，中国狂揽11金", 12211));
        set.add(new BaiduHotSearch("伊朗击败小日子是历史性一刻", 233212));
        set.add(new BaiduHotSearch("汪顺：谁说我不行", 321323));
        set.add(new BaiduHotSearch("震惊！！！", 233212));
        set.forEach(System.out::println);
        System.out.println("--------------------");
        ArrayList<BaiduHotSearch> list = new ArrayList<>();
        list.add(new BaiduHotSearch("金牌刷榜，中国狂揽11金", 12211));
        list.add(new BaiduHotSearch("伊朗击败小日子是历史性一刻", 233212));
        list.add(new BaiduHotSearch("汪顺：谁说我不行", 321323));
        list.add(new BaiduHotSearch("震惊！！！", 233212));
        list.sort(comparator);
        list.forEach(System.out::println);

    }
}
