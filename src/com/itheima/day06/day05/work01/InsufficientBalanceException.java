package com.itheima.day06.day05.work01;

/**
 * 余额不足异常
 */
public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException() {
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
