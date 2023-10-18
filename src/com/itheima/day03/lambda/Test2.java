package com.itheima.day03.lambda;

public class Test2 {
    public static void main(String[] args) {
//        2、可以把lambda表达式当做参数传递
        Calculator add = (a, b) -> System.out.println(a + b);
        add.cal(1,2);

        Calculator multiply = (a, b) -> System.out.println(a * b);
        multiply.cal(1,2);
        System.out.println("---------------------");
        calculator(add,1,2);
        calculator(multiply,1,2);

    }
    public static void calculator(Calculator calculator,int a,int b){
        calculator.cal(a,b);
    }

}
