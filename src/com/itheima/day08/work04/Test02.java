package com.itheima.day08.work04;


import java.util.ArrayList;
import java.util.Random;

/**
 * 随机生成10个[1,100]之间的整数，放到List集合中，
 * 遍历显示、找出前3名最大值，删除它们
 * 显示删除后的结果
 */
public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100) + 1;
            list.add(num);
        }
        System.out.println(list);

        for (int i = 0; i < 3; i++) {
            Integer max = list.get(0);
            int index = 0;
            for (int j = 0; j < list.size(); j++) {
                if (max.compareTo(list.get(j)) < 0) {
                    max = list.get(j);
                    index = j;
                }
            }
            System.out.println("第" + (i + 1) + "大值为索引" + index + "的" + max);
            list.remove(max);
        }
//        list.sort((o1, o2) -> o2.compareTo(o1));
//        for (int i = 0; i < 3; i++) {
//            list.removeIf(o -> o.equals(list.get(0)));
//        }
        System.out.println(list);




    }
}
