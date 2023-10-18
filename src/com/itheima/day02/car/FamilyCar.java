package com.itheima.day02.car;

/**
 * 家用轿车类
 */
public class FamilyCar extends Car {

    /**
     * 车主姓名
     */
    private String owner;


    public FamilyCar(String models, String licensePlate, String owner) {
        super(models,licensePlate);
        this.owner = owner;
    }

    public FamilyCar() {
    }

    /**
     * 启动
     */
    @Override
    public void initiate(){
        System.out.println("车辆启动");
    }

    /**
     * 停止
     */
    @Override
    public void stop(){
        System.out.println("车辆到达目的地");
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
