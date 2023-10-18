package com.itheima.day07.work02;

import com.itheima.day03.lambda.Calculator;

import java.util.Comparator;

/**
 * 商品类
 */
public class Commodity implements Comparable<Commodity> {
    /**
     * 编号
     */
    private int id;
    /**
     * 名称
     */
    private String name;
    /**
     * 单价
     */
    private double price;
    /**
     * 出版社
     */
    private String publishingHouse;

    public Commodity(int id, String name, double price, String publishingHouse) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.publishingHouse = publishingHouse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commodity commodity = (Commodity) o;

        if (id != commodity.id) return false;
        if (Double.compare(commodity.price, price) != 0) return false;
        if (name != null ? !name.equals(commodity.name) : commodity.name != null) return false;
        return publishingHouse != null ? publishingHouse.equals(commodity.publishingHouse) : commodity.publishingHouse == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }

    @Override
    public int compareTo(Commodity o) {
        return this.id - o.id;
    }
}
