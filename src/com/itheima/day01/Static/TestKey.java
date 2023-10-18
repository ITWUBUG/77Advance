package com.itheima.day01.Static;

public class TestKey {
    public static void main(String[] args) {
        Key key = new Key("134","张三");
//        静态成员都应该使用类名来调用
        Key.publicKey = "**@#$";
        Key key1 = new Key("1324","李四");
        System.out.println(Key.publicKey);

    }
}
