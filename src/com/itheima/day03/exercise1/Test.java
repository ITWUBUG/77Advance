package com.itheima.day03.exercise1;


/**
 * 测试类
 * @author admin
 */
public class Test {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床学java了");
            }
        });


    }
}
