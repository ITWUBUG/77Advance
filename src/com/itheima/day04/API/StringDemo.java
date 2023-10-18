package com.itheima.day04.API;

public class StringDemo {
    public static void main(String[] args) {
//        String成员方法
        String s = "123asd";
//        1、equals判断两个字符串内容是否相等
        boolean equals = s.equals("123");
//        2、转大小写
        String s1 = s.toUpperCase();//大写
        String s2 = s.toLowerCase();//小写
//        3、判断是否包含另外一个字符串
        boolean contains = s.contains("123");
//        4、equalsIgnoreCase忽视大小写判断两个字符串内容是否相等
        s.equalsIgnoreCase("123");
//        5、判断空字符串
//        长度为0
        s = "  ";
        s.isEmpty();
//        只包含空格或者长度为0
        s.isBlank();
//        返回char数组
        char[] chars = s.toCharArray();
//        6、判断字符串以什么开始结尾
//        以什么开始
        s.startsWith("123");
//        以什么结束
        s.endsWith("123");
//        7、删除前后空格
        String d = "     aaa a   ";
        String s3 = d.trim();
        System.out.println(d);
        System.out.println(s3);
//        8、拼接
        s.concat(d);

//        String的静态方法
//        基本类型转成字符串
        String.valueOf(213);


    }
}
