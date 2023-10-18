package com.itheima.day01.Final;

import java.util.ArrayList;

public class MyArrayList extends ArrayList {

    @Override
    public Object remove(int index) {
        System.out.println("禁止删除");
        return null;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1234);
        myArrayList.remove(0);
    }
}
