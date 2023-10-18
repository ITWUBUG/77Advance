package com.itheima.day06.day05.work01;

import java.math.BigDecimal;

/**
 * 银行账户
 *
 * @author admin
 */
public class Accouna {
    /**
     * 余额 默认值为0
     */
    private BigDecimal balance = BigDecimal.valueOf(500);
    /**
     * 持卡人
     */
    private String host;
    /**
     * 开户行
     */
    private String openBank;

    public Accouna(String host, String openBank) {
        this.host = host;
        this.openBank = openBank;
    }

    /**
     * 存钱
     *
     * @param money 钱
     */
    public void deposit(double money) {
        BigDecimal bigDecimal = BigDecimal.valueOf(money);
        balance = balance.add(bigDecimal);
    }

    /**
     * 取钱
     *
     * @param money 钱
     */
    public void withdraw(double money) {
        BigDecimal bigDecimal = BigDecimal.valueOf(money);
        balance = balance.subtract(bigDecimal);
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "exercise1{" +
                "balance=" + balance +
                ", host='" + host + '\'' +
                ", openBank='" + openBank + '\'' +
                '}';
    }
}
