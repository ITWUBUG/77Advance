package com.itheima.day03.exercise1;

/**
 * 手机类
 * @author admin
 */
public class CellPhone implements Alarmclock{


    /**
     * 手机类的闹钟功能
     * @param bell 实现铃声接口的类
     */
    @Override
    public void alarmclock(Bell bell) {
        bell.ring();
    }
}
