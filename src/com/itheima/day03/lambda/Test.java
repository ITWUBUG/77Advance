package com.itheima.day03.lambda;

/**
 * 测试类
 *
 * @author admin
 */
public class Test {
    public static void main(String[] args) {

//        省略模式1：参数类型可以省略，有多个参数时，要省略全省略
        SingWithParam singWithParam = (s, singer) -> {
            System.out.println(singer + "唱了一首" + s);
        };
        singWithParam.sing("千里之外", "费玉清");
//        参数名与接口一致
        SingWithParam singWithParam1 = (song, singer) -> {
            System.out.println(singer + "唱了一首" + song);
        };



        System.out.println("-----------------------");
//        省略模式2：参数只有1个，省略小括号
        SingWithOneParm singWithOneParm = (songs) -> {
            System.out.println("连唱" + songs);
        };
        singWithOneParm.song(10);



        System.out.println("-----------------------");
//        省略模式3：代码块中只有一条语句，可以省略大括号，如果有return，return也要省略
//        SingWithReturn singWithReturn = (song)->{return song.length();};
        SingWithReturn singWithReturn = (song)-> song.length();
        int i = singWithReturn.song("asdfasf");
        System.out.println(i);



    }
}
