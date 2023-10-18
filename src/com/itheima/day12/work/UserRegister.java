package com.itheima.day12.work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserRegister {

    public static void main(String[] args) throws IOException {

        // 键盘录入要注册的用户名和密码
        Scanner sc = new Scanner(System.in) ;
        System.out.println("请输入注册邮箱号：");
        String email = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine() ;

        // 将用户输入的用户名和密码存储到文件中
        String info = email + "=" + password ;
        BufferedWriter bw = new BufferedWriter(new FileWriter("users.properties"));
        bw.write(info);
        bw.newLine();
        bw.flush();

        // 补全代码实现发送邮件功能
        new Thread(()-> System.out.println("给" + email +"发送激活邮件成功")).start();

        // 注册成功提示信息
        System.out.println("恭喜您注册成功，请前往注册邮箱进行激活操作！");

    }

}
