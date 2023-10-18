package com.itheima.day15.exercise;

/**
 * 建造者模式：
 * 1.创建一个静态内部Builder类
 * 2.原本的类有哪些属性，内部类也得有哪些属性
 * 3.有几个属性就在内部类中提供几个赋值方法，这些方法的返回值必须得是内部类对象(可以链式调用)
 * 4.内部类中提供无参build方法，返回原本类(外部类)的对象
 * 5.因为所有的属性值都存在了内部类里面，给外部类提供一个有内部类参数的构造器
 */
public class Student {
    private String name;
    private int age;
    private String gender;
    private String address;

    /**
     * 构建者类
     */
    public static class Builder{
        private String name;
        private int age;
        private String gender;
        private String address;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }

    public Student(Builder build) {
        this.name = build.name;
        this.age = build.age;
        this.gender = build.gender;
        this.address = build.address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
