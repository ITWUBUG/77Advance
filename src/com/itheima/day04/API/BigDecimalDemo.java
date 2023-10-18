package com.itheima.day04.API;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
//        浮点数带来的问题
        System.out.println(0.1 + 0.2);
        System.out.println(1/0.0);
        double a = 1;
        double b = 20.2;
        double c = 300.03;
        System.out.println(a+b+c);
//        传递double的并不能实现精确计算
        BigDecimal aDecimal = new BigDecimal(a);
        BigDecimal bDecimal = new BigDecimal(b);
        BigDecimal cDecimal = new BigDecimal(c);
//        每一次调用加减乘除方法都会返回一个新的BigDecimal

        BigDecimal add1 = aDecimal.add(bDecimal).add(cDecimal);
//        BigDecimal add1 = aDecimal.divide(bDecimal);
        System.out.println(add1);
//         传递字符串的可以实现精确计算 类转换String.valueof(double )
        BigDecimal aDecimal1 = new BigDecimal(String.valueOf(a));
        BigDecimal bDecimal1 = new BigDecimal(String.valueOf(b));
        BigDecimal cDecimal1 = new BigDecimal(String.valueOf(c));
        BigDecimal add2 = aDecimal1.add(bDecimal1).add(cDecimal1);
        System.out.println(add2);
//       使用静态方法来创建BigDecimal对象
        BigDecimal aDecimal2 = BigDecimal.valueOf(a);
        BigDecimal bDecimal2 = BigDecimal.valueOf(b);
        BigDecimal cDecimal2 = BigDecimal.valueOf(c);
        BigDecimal add3 = aDecimal2.add(bDecimal2).add(cDecimal2);
//        setScale(小数位，舍入模式)
        BigDecimal add4 = aDecimal2.add(bDecimal2).add(cDecimal2).setScale(3, RoundingMode.DOWN);
        System.out.println(add3);
        System.out.println(add4);
//       定义 0
        BigDecimal zero = BigDecimal.ZERO;
//        2.加add 减subtract 乘multiply 除divide
        BigDecimal one = BigDecimal.ONE;
        BigDecimal three = BigDecimal.valueOf(3);
//        除法有除不尽 使用divide(除数，小数位，舍入模式)
        BigDecimal divide = one.divide(three, 4, RoundingMode.DOWN);
        System.out.println(divide);
    }
}
