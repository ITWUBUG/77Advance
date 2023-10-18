package com.itheima.day15.exercise;

public class Test {
    public static void main(String[] args) {
        //建造者模式：首先是为了创建对象出现解决一个类的构造器参数过多，set又太过臃肿
        Student.Builder builder = new Student.Builder();
        Student build = builder.name("张三")
                .age(15)
                .gender("男")
                .address("杭州")
                .build();
        System.out.println(build);
    }
}
