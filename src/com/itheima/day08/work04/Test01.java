package com.itheima.day08.work04;


import java.util.*;

/**
 * 生成随机验证码
 */
public class Test01 {
    public static void main(String[] args) {
        char[] c = new char[62];
        for (int i = 0; i < 26; i++) {
            c[i] = (char) ('a' + i);
        }
        for (int i = 0; i < 26; i++) {
            c[i + 26] = (char) ('A' + i);
        }
        for (int i = 0; i < 10; i++) {
            c[i + 52] = (char) ('0' + i);
        }
        HashMap<String, List<Character>> map = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ArrayList<Character> characters = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                int i1 = random.nextInt(62);
                characters.add(c[i1]);
            }
            map.put(String.valueOf((i + 1)), characters);
        }
        map.forEach((o1, o2) -> System.out.println(o1 + ":" + o2));

    }
}
