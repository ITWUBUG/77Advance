package com.itheima.day12.exercise;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();

        BankUser bankUser = new BankUser(account);
        Thread thread = new Thread(bankUser);
        thread.setName("李小姐");
        thread.start();

        BankUser bankUser1 = new BankUser(account);
        Thread thread1 = new Thread(bankUser1);
        thread1.setName("包小姐");
        thread1.start();

        Thread.sleep(1000);
        System.out.println(account.getBalance());
    }
}
