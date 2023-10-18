package com.itheima.day09;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArrayStreamDemo01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
//        Optional类：防止为空
//        1.get...获取值
//        2.isPresent 判断值是否存在
//        3.orElse 如果不存在提供默认值

        OptionalInt max = Arrays.stream(arr).max();
        if (max.isPresent()){
            System.out.println(max.getAsInt());
        }
        OptionalDouble average = Arrays.stream(arr).average();
        if (average.isPresent()){
            System.out.println(average.getAsDouble());
        }
        System.out.println(average.orElse(100));
//        reduce 归约、折叠（把所有的值变成一个） 一定要符合数学的结合律
        OptionalInt reduce = Arrays.stream(arr).reduce((left, right) -> right * left);
        System.out.println(reduce.getAsInt());
//        reduce重载方法，提供原值（初始值）
        int reduce1 = Arrays.stream(arr).reduce(100, (Integer::sum));
        System.out.println(reduce1);
    }
}
