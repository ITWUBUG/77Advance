package com.itheima.day04.API;

import java.util.ArrayList;

public class IntegerDemo01 {
    public static void main(String[] args) {

//        数值获取最大值最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
//        类型转换
//        NumberFormatException 数字格式异常 要是所转换类型的数值
//        基本转String
        String s2 = String.valueOf(1);
        String s1 = Integer.toString(1);
        String s = Double.toString(1.1);

//        String转基本
        int i = Integer.parseInt("123");
        double v = Double.parseDouble("1.1");

//        String转基本包装类
        Integer integer = Integer.valueOf("123");
//        包装类比较大小 valueOf方法缓存了常用的[-128-127]
        Integer a = 125;
        Integer b = new Integer(125);
        System.out.println(a == b);
//        使用equals比较
        System.out.println(a.equals(b));
//        compareTo 相等返回0     前面小于后面-1    前面大于后面1
        int i1 = a.compareTo(b);
        System.out.println(i1);
//        其他包装类中的特有方法
        boolean a1 = Character.isDigit('a');//判断是不是数字
        System.out.println(a1);
        boolean a2 = Character.isLetter('你');//判断是不是字母
        System.out.println(a2);


    }
}
