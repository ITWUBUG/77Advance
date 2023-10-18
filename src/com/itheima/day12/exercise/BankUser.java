package com.itheima.day12.exercise;

public class BankUser implements Runnable {

    private Account account;

    public BankUser(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(1000);
            System.out.println(Thread.currentThread().getName() + "存了1000");
        }
    }
}
