package com.itheima.day07.work;

import java.util.Random;
import java.util.TreeSet;

public class Work01 {
    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<Integer> set = new TreeSet<>();
        while (set.size() < 6) {
            set.add(random.nextInt(33) + 1);
        }
        System.out.println("红球：" + set + "|蓝球：" + (random.nextInt(16) + 1));

    }
}
