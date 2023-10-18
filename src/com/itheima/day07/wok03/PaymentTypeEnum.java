package com.itheima.day07.wok03;

public enum PaymentTypeEnum {
    CHARGE_TYPE_CHARGED(10131001,"自费"),
    CHARGE_TYPE_FREE(10131002,"免费"),
    CHARGE_TYPE_MEMBER_RIGHTS(10131003,"会员权益");

    private int id;
    private String name;

    PaymentTypeEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void intToPaymentType(int code){
        PaymentTypeEnum[] values = PaymentTypeEnum.values();
        for (PaymentTypeEnum value : values) {
            if(code == value.id){
                System.out.println(value.name);
                return;
            }
        }
        throw new RuntimeException("输入的付款方式标号不正确");
    }
}
