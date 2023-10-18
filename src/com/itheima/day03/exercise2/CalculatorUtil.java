package com.itheima.day03.exercise2;

/**
 * 计算机工具类
 * @author admin
 */
public class CalculatorUtil {

    private CalculatorUtil() {
    }

    /**
     * 计算方法
     * @param calculator Calculator接口的实现类
     * @param a 整数
     * @param b 整数
     */
    public static void useCalculator(Calculator calculator,int a,int b){
        calculator.calculator(a,b);
    }
}
