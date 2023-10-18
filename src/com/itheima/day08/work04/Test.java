package com.itheima.day08.work04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 键盘录入学生信息，保存到集合中
 */
public class  Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            Student student = new Student();

            System.out.println("请输入学生姓名");
            String name = scanner.next();
            student.setName(name);

            System.out.println("请输入学生年龄");
            int age = scanner.nextInt();
            student.setAge(age);

            list.add(student);
            System.out.println("是否继续输入");
            System.out.println("1：表示继续录入，0：表示结束录入");

            while (true) {
                String choose = scanner.next();
                if ("1".equals(choose)) {
                    System.out.println("请继续录入");
                    break;
                } else if ("0".equals(choose)) {
                    System.out.println("结束录入");
                    flag = false;
                    break;
                } else {
                    System.out.println("输入不正确");
                    System.out.println("1：表示继续录入，0：表示结束录入");
                }
            }
        }
        list.forEach(System.out::println);
    }
}
