package com.itheima.day15;

public class Computer {

    private String brand;

    private double price;

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Computer() {
    }

    private void play(String game){
        System.out.println("玩"+game);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
