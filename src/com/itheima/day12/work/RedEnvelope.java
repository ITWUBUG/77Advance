package com.itheima.day12.work;


/**
 * 红包类
 */
public class RedEnvelope {
    /**
     * 红包的总数量
     */
    private int quantity;

    public RedEnvelope(int quantity) {
        this.quantity = quantity;
    }

    public RedEnvelope() {
    }

    /**
     * 抢红包
     */
    public synchronized boolean take() {
        if (quantity > 0) {
            quantity--;
            return true;
        }
        return false;
    }

    public int getQuantity() {
        return quantity;
    }
}
