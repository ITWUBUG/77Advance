package com.itheima.day06.day05.exception;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class TryCatchDemo {
    public static void main(String[] args) {
        method();
//        1、try ..catch解决了前两种方式声明或者抛出编译异常带来的层层声明的问题
//        2、catch可以有多个，可以根据不同的异常类进行不同的处理 一般要搭配throe抛出使用


//        细节：1、一般catch最好要捕获 exception 或者 RunTimeException
//             2、一般在catch里面都抛出运行时异常
//             3、catch不抛出异常对象 -> 吞没异常 搭配 printStackTrace方法使用
    }
    public static void method(){
        readFile("c:/a.test");
    }
    public static void readFile(String path){
//            try放置有可能会发生异常的代码
        try{
//            发生算术异常
//            System.out.println(1/0);
//            数值转换异常
            Integer integer = Integer.valueOf("12");
            System.out.println(integer);

            throw new FileNotFoundException("找不到文件");
//            捕获异常的信息
        }catch (FileNotFoundException e){
            throw new RuntimeException("文件未找到");
        }catch (ArithmeticException e){
            throw new RuntimeException("除数不能为0");
        }catch (IllegalAccessError e){
            throw new RuntimeException("字符串数值格式不正确");
        }catch(Exception e){
            throw new RuntimeException("程序运行错误");
        }

    }
}
