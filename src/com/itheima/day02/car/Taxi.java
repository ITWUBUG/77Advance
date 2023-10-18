package com.itheima.day02.car;

/**
 * 出租车类
 */
public class Taxi extends Car {

    /**
     * 所属出租公司
     */
    private String rentalCompany;

    public Taxi(String models, String licensePlate, String rentalCompany) {
        super(models,licensePlate);
        this.rentalCompany = rentalCompany;
    }

    public Taxi() {
    }


    /**
     * 启动
     */
    @Override
    public void initiate(){
        System.out.println("车辆启动，请系好安全带");
    }

    /**
     * 停止
     */
    @Override
    public void stop(){
        System.out.println("车辆到达目的地");
    }

    public String getRentalCompany() {
        return rentalCompany;
    }

    public void setRentalCompany(String rentalCompany) {
        this.rentalCompany = rentalCompany;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "rentalCompany='" + rentalCompany + '\'' +
                "} " + super.toString();
    }
}
