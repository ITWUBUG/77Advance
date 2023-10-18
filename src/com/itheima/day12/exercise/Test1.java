package com.itheima.day12.exercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;

public class Test1 {
    public static void main(String[] args) {
//        线程不安全
        StringBuilder stringBuilder = new StringBuilder();
//        线程安全
        StringBuffer stringBuffer = new StringBuffer();

//        线程不安全
        HashMap<Object, Object> map = new HashMap<>();
//        线程安全
        Hashtable<Object, Object> table = new Hashtable<>();



//        jdk中
//        基本数据类型
//        包装类
//        大类
//        原子类 Atomic类
        AtomicInteger atomicInteger = new AtomicInteger(10);
//        用于替代多线程下的a++操作
        int i = atomicInteger.incrementAndGet();
        System.out.println(i);

//        JUC包 java.util.concurrent 并发包

    }
}
