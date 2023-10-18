package com.itheima.day02.car;

/**
 * 汽车类
 */
public abstract class Car {

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
    public abstract void initiate();

    /**
     * 停止
     */
    public abstract void stop();

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    @Override
    public String toString() {
        return "Car{" +
                "models='" + models + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
