package com.itheima.day12.exercise;

import java.math.BigDecimal;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 账户类
 */
public class Account {
    /**
     * 余额
     */
    private BigDecimal balance = BigDecimal.ZERO;

    private final Object lock = new Object();

    private ReentrantLock reentrantLock = new ReentrantLock();




    /*
     * synchronized
     * 同步锁： 锁的是方法
     * 互斥锁： 线程互斥，同时只能有一个线程执行加锁方法
     * 非公平锁： 线程抢锁的概率是随机的
     * 隐式锁：看不到锁
     * 可重入锁： 同一个线程抢到锁之后可以再次获取该锁
     * 加锁的步骤：1.首先所有线程参与抢锁
     *           2.成功强的锁的线程执行加锁的方法
     *           3.释放锁
     */

    public /* synchronized */ void deposit(double money) {
//        synchronized (lock) {
////        add是一个非原子操作
//          原子操作所有操作要么一起执行,要么一起失败
//            balance = balance.add(BigDecimal.valueOf(money));
//        }
        reentrantLock.lock();
        try{
            balance = balance.add(BigDecimal.valueOf(money));
        }finally {
            reentrantLock.unlock();
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
