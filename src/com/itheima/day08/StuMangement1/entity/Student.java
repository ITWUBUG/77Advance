package com.itheima.day08.StuMangement1.entity;

import com.itheima.day08.StuMangement.entity.User;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 学生类
 */
public class Student extends User implements Serializable {

    /**
     * 地址
     */
    private String address;

    /**
     * 年龄
     */
    private int age;

    /**
     * 入学日期
     */
    private String enrollDate;


    public Student(String name, String id, String address, int age) {
        super(name, id);

        this.address = address;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Override
    public String toString() {
        return "[学号=" + super.getId() +
                ",姓名=" + super.getName() +
                "地址=" + address +
                ", 年龄=" + age +
                ", 入学日期='" + enrollDate + '\'' +
                ']';
    }
}
