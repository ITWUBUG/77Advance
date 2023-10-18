package com.itheima.day04.work;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        double[] arr = {1.2, 0.6, 0.01, 3.2, 50.78};
        BigDecimal length = BigDecimal.valueOf(arr.length);
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < arr.length; i++) {
            BigDecimal temp = BigDecimal.valueOf(arr[i]);
            sum = sum.add(temp);
        }
        BigDecimal avg = sum.divide(length, 2, RoundingMode.DOWN);
        System.out.println(avg);

    }
}
