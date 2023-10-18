package com.itheima.day09;

import java.util.ArrayList;

public class CollectionStreamDemo {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(new Teacher("张三"));
        list.add(new Teacher("李三"));
        list.add(new Teacher("王三"));
        list.add(new Teacher("张三"));

        list.stream().distinct().filter(o->o.getName().startsWith("李")).forEach(System.out::println);


    }

}
