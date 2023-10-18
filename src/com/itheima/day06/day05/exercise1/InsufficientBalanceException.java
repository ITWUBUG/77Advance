package com.itheima.day06.day05.exercise1;

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
