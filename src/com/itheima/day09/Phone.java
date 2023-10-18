package com.itheima.day09;

public class Phone {
    private double price;
    private String brand;

    public Phone() {
    }

    public Phone(String brand,double price) {
        this.price = price;
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (Double.compare(phone.price, price) != 0) return false;
        return brand != null ? brand.equals(phone.brand) : phone.brand == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }
}
