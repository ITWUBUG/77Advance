package com.itheima.day11.charsetStream;

import java.io.Serializable;
import java.util.Collection;

public class Student implements Serializable {
    private String name;
    private int age;

    private static final long serialVersionUID = 1000L;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
