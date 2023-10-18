package com.itheima.day12.work;

/**
 * 家庭成员
 */
public class FamilyMembers implements Runnable {

    /**
     * 红包
     */
    private RedEnvelope redEnvelope;

    /**
     * 名字
     */
    private String name;

    public FamilyMembers(RedEnvelope redEnvelope, String name) {
        this.redEnvelope = redEnvelope;
        this.name = name;
    }

    public FamilyMembers() {
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (redEnvelope.take()) {
            System.out.println("恭喜" + name + ",您成功抢到一个20元的红包");
        } else {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "抱歉，红包已经抢完了");
        }
    }
}
