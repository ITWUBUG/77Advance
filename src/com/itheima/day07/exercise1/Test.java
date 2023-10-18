package com.itheima.day07.exercise1;

import java.util.HashSet;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while (set.size() < 10) {
            set.add(random.nextInt(20) + 1);
        }
        set.forEach(System.out::println);
    }
}
