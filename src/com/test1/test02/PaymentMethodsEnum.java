package com.test1.test02;


/**
 * 支付方式枚举类
 */
public enum PaymentMethodsEnum {

    /**
     * 信用卡支付
     */
    CREDIT_CARD("信用卡支付", 1) {
        @Override
        public void function() {
            System.out.println("你选择了信用卡支付");
        }
    },

    /**
     * 储蓄卡支付
     */
    DEBIT_CARD("储蓄卡支付", 2) {
        @Override
        public void function() {
            System.out.println("你选择了储蓄卡支付");
        }
    },

    /**
     * 微信支付
     */
    WECHAT("微信支付", 3) {
        @Override
        public void function() {
            System.out.println("你选择了微信支付");
        }
    },

    /**
     * 支付宝支付
     */
    ALIPAY("支付宝支付", 4) {
        @Override
        public void function() {
            System.out.println("你选择了支付宝支付");
        }
    };

    PaymentMethodsEnum(String name, int choose) {
        this.name = name;
        this.choose = choose;
    }

    /**
     * 支付方式名称
     */
    private String name;

    /**
     * 选择
     */
    private int choose;


    public abstract void function();

    /**
     * 功能选择
     * @param choose  选择的支付方式
     */
    public static void chooseFunction(int choose){
        PaymentMethodsEnum[] values = PaymentMethodsEnum.values();
        for (PaymentMethodsEnum value : values) {
            if (choose == value.choose){
                value.function();
                return;
            }
        }
       throw new IllegalArgumentException("没有次支付方式");
    }


}
