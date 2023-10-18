package com.itheima.day04.API;

public class ObjectDemo {
    public static void main(String[] args) {
//        toString 重写之前 Object 地址
//        之后内容
        Phone phone = new Phone("123", 123);
        Phone phone1 = new Phone("123", 123);
        Object o = new Object();
        System.out.println(o);
        System.out.println(phone);
        System.out.println(phone1);
//       不重写 equals 就是比较地址值
//        重写之后比教内容
        Object s = new Object();
        System.out.println(s.equals(o));
        System.out.println(phone.equals(phone1));
    }
}
