package com.itheima.day08.StuMangement.entity;

/**
 * 学生类
 */
public class Student extends User{

    /**
     * 地址
     */
    private String address;

    /**
     * 年龄
     */
    private int age;



    public Student(String name, String id, String address, int age) {
        super(name,id);

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

}
