package com.itheima.day06.day05.exception;

import java.io.FileNotFoundException;
import java.util.Objects;

public class ThrowDemo {
    public static void main(String[] args) {
//        int[] arr = null;
//        sumArr(arr);
        avg(10,0);

    }

    public static void sumArr(int[] arr) {
        if (Objects.isNull(arr)) {
//            1.throw具有return的作用
//            2、抛出异常有具体的异常类型与异常信息
//            3、可以自定义异常信息
//            4、当一个方法具备返回值的时候，不知道return哪个具体值，应该抛出一个异常对象
//            5、抛出编译异常，该方法得声明该编译异常
            throw new NullPointerException("数组为空");
//            System.out.println("数组为空");
//            return;
        }
    }

    public static double avg(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("除数不能为0");
        }
        return a / b;
    }
    public static void readFile() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
