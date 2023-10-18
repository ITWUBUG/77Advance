package com.test2;

import com.itheima.day15.AutoRun;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class TestAutoRun {
    public static void main(String[] args) {
        try {
            Class aClass = Class.forName("com.test2.TestAutoRun");
//            获取所有的方法
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                AutoRun declaredAnnotation = declaredMethod.getDeclaredAnnotation(AutoRun.class);
//                运行获取到的注解是否为空
                if (Objects.nonNull(declaredAnnotation)) {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(new TestAutoRun());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }

    @AutoRun
    public void method1() {
        System.out.println("方法1运行");
    }

    public void method2() {
        System.out.println("方法2运行");
    }

    @AutoRun
    public void method3() {
        System.out.println("方法3运行");
    }

    public void method4() {
        System.out.println("方法4运行");
    }


}
