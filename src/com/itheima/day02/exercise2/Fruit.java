package com.itheima.day02.exercise2;

/**
 * 抽象水果类
 */
public abstract class Fruit {
    /**
     * 名称
     */
    private String name;
    /**
     * 产地
     */
    private String localityOfGrowth;
    /**
     * 价格
     */
    private double price;


    public Fruit(String type, String localityOfGrowth, double price) {
        this.name = type;
        this.localityOfGrowth = localityOfGrowth;
        this.price = price;
    }

    public Fruit() {
    }

    /**
     * 开花
     */
    public abstract void bloom();

    /**
     * 结果
     */
    public abstract void grouwUp();

    /**
     * 采摘
     */
    public abstract void pick();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalityOfGrowth() {
        return localityOfGrowth;
    }

    public void setLocalityOfGrowth(String localityOfGrowth) {
        this.localityOfGrowth = localityOfGrowth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type='" + name + '\'' +
                ", localityOfGrowth='" + localityOfGrowth + '\'' +
                ", price=" + price +
                '}';
    }
}
