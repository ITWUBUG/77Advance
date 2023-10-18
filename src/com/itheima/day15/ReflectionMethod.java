package com.itheima.day15;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMethod {
    public static void main(String[] args) {
        Computer computer = new Computer();
        try {
            Class aClass = Class.forName("com.itheima.day15.Computer");
//            获取私有方法
            Method play = aClass.getDeclaredMethod("play", String.class);
//            设置权限
            play.setAccessible(true);
//            调用方法
            Object lol = play.invoke(computer, "lol");
            System.out.println(lol);//null 返回值void
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
