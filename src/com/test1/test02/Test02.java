package com.test1.test02;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
//        1.2 在进行手机支付的时候,常常会让我们选择信用卡支付,储蓄卡支付,微信支付,支付宝支付,请选择合适的设计模式来实现
        System.out.println("请选择支付方式");
        System.out.println("1信用卡支付\t2储蓄卡支付\t3微信支付\t4支付宝支付");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        PaymentMethodsEnum.chooseFunction(i);


    }
}
