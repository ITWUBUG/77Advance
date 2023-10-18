package com.itheima.day07.wok03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入付款方式标号");
        int i = scanner.nextInt();
        PaymentTypeEnum.intToPaymentType(i);
    }
}
