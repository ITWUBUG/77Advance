package com.itheima.day08.StuMangement.entity;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 学生管理系统
 *
 * @author admin
 */
@SuppressWarnings("all")
public class StuSystemManager {
    private static HashSet<Admin> admins = new HashSet<>();

    static {
        Admin admin = new Admin("001", "001");
        admins.add(admin);
    }

    public static void main(String[] args) {

        ee:while (true) {
            Admin admin = null;
            if ((admin = login()) == null) {
                continue ;
            }
            while (true) {
                screen();
                Scanner scanner = new Scanner(System.in);
                String choose = scanner.next();
                switch (choose) {
                    case "1" -> addStudent(admin);
                    case "2" -> removeStudent(admin);
                    case "3" -> setStudent(admin);
                    case "4" -> findStuden(admin);
                    case "5" -> {
                        if (exit()) {
                            break ee;
                        }
                    }
                    default -> System.out.println("功能未开放");
                }
            }
        }

    }

    /**
     * 键盘录入用户名以及密码并判断是否正确
     *
     * @return true用户名密码正确
     */
    public static Admin login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();
        for (Admin admin1 : admins) {
            if (admin1.getUSER_ID().equals(name)) {
                if (name.equals(admin1.getUSER_ID()) || password.equals(admin1.getPASSWORD())) {
                    return admin1;
                }
            }
        }
        System.out.println("用户名或者密码输入错误，重新录入");
        return null;
    }

    /**
     * 界面
     */
    public static void screen() {
        System.out.println("---------------------------");
        System.out.println("\t1.增加学生");
        System.out.println("\t2删除学生");
        System.out.println("\t3修改学生");
        System.out.println("\t4查询学生");
        System.out.println("\t5退出系统");
        System.out.println("--------------------------");
    }

    /**
     * 增加学生
     *
     * @param admin 管理员
     */
    public static void addStudent(Admin admin) {
        admin.addStudent();
    }

    /**
     * 删除学生
     *
     * @param admin 管理员
     */
    public static void removeStudent(Admin admin) {
        admin.removeStudent();
    }

    /**
     * 修改学生
     *
     * @param admin 管理员
     */
    public static void setStudent(Admin admin) {
        admin.setStudent();
    }

    /**
     * 查询学生
     *
     * @param admin 管理员
     */
    public static void findStuden(Admin admin) {
        admin.findStudent();
    }

    /**
     * 退出系统
     */
    public static boolean exit() {
        System.out.println("确定要退出系统吗");
        System.out.println("1 退出\t\t2 继续");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        return "1".equals(next);
    }


}
