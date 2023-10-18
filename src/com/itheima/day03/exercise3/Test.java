package com.itheima.day03.exercise3;

/**
 * 测试类
 * @author admin
 */
public class Test {
    public static void main(String[] args) {
        UseStringValueOf useStringValueOf = a->String.valueOf(a);
        String s = useStringValueOf.stringValueOf(6);
        System.out.println(s);
    }
}
