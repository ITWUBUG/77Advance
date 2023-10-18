package com.itheima.day01.car;

/**
 * 汽车类
 */
public class Car {

    /**
     * 车型
     */
    private String models;

    /**
     * 车牌
     */
    private String licensePlate;

    public Car(String models, String licensePlate) {
        this.models = models;
        this.licensePlate = licensePlate;
    }

    public Car() {
    }

    /**
     * 启动
     */
    public void initiate(){
        System.out.println("车辆启动");
    }

    /**
     * 停止
     */
    public void stop(){
        System.out.println("车辆停止");
    }

}
