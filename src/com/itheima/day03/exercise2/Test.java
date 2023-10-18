package com.itheima.day03.exercise2;

/**
 * 测试类
 * @author admin
 */
public class Test {
    public static void main(String[] args) {
        Calculator add = (a, b) -> {
            System.out.println(a + b);
        };
        Calculator subtract = (a, b) -> {
            System.out.println(a - b);
        };
        Calculator multiply = (a, b) -> {
            System.out.println(a * b);
        };
        Calculator divide = (a, b) -> {
            System.out.println(a / b);
        };

        CalculatorUtil.useCalculator(add,2,3);
        CalculatorUtil.useCalculator(subtract,2,3);
        CalculatorUtil.useCalculator(multiply,2,3);
        CalculatorUtil.useCalculator(divide,2,3);

    }
}
