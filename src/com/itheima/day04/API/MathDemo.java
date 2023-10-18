package com.itheima.day04.API;

public class MathDemo {
    public static void main(String[] args) {
//        1、absolute value 绝对值
        int abs = Math.abs(-1);
        System.out.println(abs);
//       2、round 四舍五入
        long round = Math.round(2.8);
        System.out.println(round);
//       3、ceil 天花板 向上取整
        double ceil = Math.ceil(2.1);
        System.out.println(ceil);
//        4、floor 地板 向下取整
        double floor = Math.floor(1.8);
        System.out.println(floor);
//        5、最大，最小
        Math.max(2,3);
        Math.min(2,3);
//        6、power 求幂
        double pow = Math.pow(2, 3);
        System.out.println(pow);
//        7、随机数
        double random = Math.random();
        System.out.println(random);


    }
}
