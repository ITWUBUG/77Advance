package com.itheima.day08.StuMangement1.exceptions;

/**
 * 管理系统操作异常
 * @author admin
 */
public class OperationException extends RuntimeException{
    public OperationException() {
    }

    public OperationException(String message) {
        super(message);
    }
}
