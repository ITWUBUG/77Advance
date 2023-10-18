package com.itheima.day06.day05.work01;



import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        AtmServiceImpl atmService = new AtmServiceImpl();
        Accouna accouna = new Accouna("张三", "瑞士银行");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入取钱金额");
        Double money = scanner.nextDouble();
        if(atmService.drawMoney(accouna, money)){
            accouna.withdraw(money);
            System.out.println("恭喜你取钱成功！本次取钱金额为："+money+"，剩余金额："+accouna.getBalance());
        }


    }
}
