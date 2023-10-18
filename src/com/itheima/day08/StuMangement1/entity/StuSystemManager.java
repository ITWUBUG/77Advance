package com.itheima.day08.StuMangement1.entity;

import com.itheima.day08.StuMangement1.enums.MenuEnum;
import com.itheima.day08.StuMangement1.exceptions.OperationException;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 学生管理系统
 *
 * @author admin
 */
public class StuSystemManager {

    public static void main(String[] args) {
        StuSystemManager stuSystemManager = new StuSystemManager();

    }

    public StuSystemManager() {
        login();
    }

    /**
     * 登录
     *
     * @return true用户名密码正确
     */
    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();
        while (!name.equals(com.itheima.day08.StuMangement1.entity.Admin.USER_ID) ||
                !password.equals(com.itheima.day08.StuMangement1.entity.Admin.PASSWORD)) {
            System.out.println("用户名或者密码输入错误，重新录入");
            System.out.println("请重新输入用户名");
            name = scanner.next();
            System.out.println("请重新输入密码");
            password = scanner.next();
        }
        Admin admin = Admin.createSingleton();
        admin.readData();
        while (true) {
            System.out.println("-------------欢迎来到学生管理系统------------------");
            System.out.println("1.增加学生\t2删除学生\t\t3修改学生\t\t4查询学生\t\t5退出系统");
            int choose = scanner.nextInt();
            try {
//                策略模式:根据不同指令执行不同功能（策略）一般用来替代有策略的switch和if，在Java中策略模式可以使用枚举实现
//                switch (choose) {
//                    case "1" -> admin.add();
//                    case "2" -> admin.delete();
//                    case "3" ->admin.update();
//                    case "4" -> admin.query();
//                    case "5" -> System.exit(0);
//                    default -> System.out.println("功能未开放");
//                  }
                MenuEnum.doaction(choose);

            } catch (OperationException e) {
                e.printStackTrace();

            }

        }


    }
}
