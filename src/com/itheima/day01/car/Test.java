package com.itheima.day01.car;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("丰田","浙B1234");
        car.initiate();
        car.stop();


        System.out.println("------------------");
        Taxi taxi = new Taxi("大众","浙B2345","浙江出租车公司");
        taxi.initiate();
        taxi.stop();


        System.out.println("------------------");
        FamilyCar familyCar = new FamilyCar("凯迪拉克","浙B5663","张三");
        familyCar.initiate();
        familyCar.stop();

    }

}
