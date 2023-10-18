package com.itheima.day04.API;

public class IntegerDemo {
    public static void main(String[] args) {
//       过时的构造器
//        Integer integer = new Integer(10);
//       使用ValueOf封装基本数据类型
//        装箱
        Integer integer1 = Integer.valueOf(10);
//        拆箱
        int c = integer1.intValue();

//        自动装箱和拆箱 :底层自动调用valueOf()和...Value()方法
        Integer a = 123;
        Integer b = 342;
        int d = a + b;
        Integer e = a + b;
        System.out.println(d);
        System.out.println(e);


    }
}
