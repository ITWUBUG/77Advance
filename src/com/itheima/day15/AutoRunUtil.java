package com.itheima.day15;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class AutoRunUtil {
    private AutoRunUtil() {
    }

    /**
     * 调用有AutoRun注解的方法
     * 反射是框架的灵魂，框架要遵循约束
     *
     * @param className  权限定名
     */
    public static void invokeMethodWithAutoRun(String className){
        try {
            //1.获取Class对象
            Class className1 = Class.forName(className);
            //2.获取构造器
            Constructor declaredConstructor = className1.getDeclaredConstructor();
            //3.创建对象
            declaredConstructor.setAccessible(true);
            Object instance = declaredConstructor.newInstance();
            //4.获取所有的方法

            Method[] declaredMethods = className1.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                AutoRun declaredAnnotation = declaredMethod.getDeclaredAnnotation(AutoRun.class);

                if (Objects.nonNull(declaredAnnotation)){
                    declaredMethod.invoke(instance);
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
