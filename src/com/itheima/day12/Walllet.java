package com.itheima.day12;

public class Walllet {
    private double money;
    private String name;

    public Walllet(double money, String name) {
        this.money = money;
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Walllet{" +
                "money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
