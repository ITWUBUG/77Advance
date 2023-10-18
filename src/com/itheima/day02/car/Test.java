package com.itheima.day02.car;

public class Test {
    public static void main(String[] args) {

        Car car1 = new Taxi("大众","浙B2345","浙江出租车公司");
        car1.initiate();
        car1.stop();


        System.out.println("------------------");
        Car car2 = new FamilyCar("凯迪拉克","浙B5663","张三");
        car2.initiate();
        car2.stop();

    }

}
