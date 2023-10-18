package com.itheima.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("all")
public class ReflactionDemo {
    public static void main(String[] args) {
        try {
//            1.获取class对象
            Class aClass = Class.forName("com.itheima.day15.Computer");

            Class computerClass = Computer.class;

            Computer computer = new Computer();
            Class aClass1 = computer.getClass();

            System.out.println("-------获取构造器 只有公有的------");
//            获取构造器
//            1.获取构造器 只有公有的

            Constructor[] constructors = aClass.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }

            System.out.println("-------获取所有的构造器包括私有的------");
//            2.获取所有的构造器包括私有的

            Constructor[] declaredConstructors = aClass.getDeclaredConstructors();
            for (Constructor constructor : declaredConstructors) {
                System.out.println(constructor);
            }

//            使用私有构造器创建对象
            Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class, double.class);
//            设置权限可以访问
            declaredConstructor.setAccessible(true);
//            传递构造器实参
            Computer instance = (Computer)declaredConstructor.newInstance("华为", 9999);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
