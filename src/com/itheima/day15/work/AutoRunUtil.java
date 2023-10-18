package com.itheima.day15.work;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class AutoRunUtil {
    private AutoRunUtil() {
    }

    public static void invokeMethodWithAutoRun(String className) {
        try {
            Class aClass = Class.forName(className);
            Constructor declaredConstructor = aClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            Object instance = declaredConstructor.newInstance();
            Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                AutoRun declaredAnnotation = declaredMethod.getDeclaredAnnotation(AutoRun.class);
                if (Objects.nonNull(declaredAnnotation)){
                    declaredMethod.invoke(declaredConstructor);
                }
            }

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
