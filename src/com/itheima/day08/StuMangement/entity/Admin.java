package com.itheima.day08.StuMangement.entity;

import com.itheima.day08.StuMangement1.exceptions.OperationException;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 管理员类
 */
public class Admin extends User {

    /**
     * 用户名
     */
    private  String USER_ID = "admin";

    /**
     * 密码
     */
    private  String PASSWORD = "123456";

    /**
     * 学生集合
     */
    private HashSet<Student> students = new HashSet<>();


    public Admin(String name, String id) {
        super(name, id);
    }

    /**
     * 增加学生
     */
    public void addStudent() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.next();
        System.out.println("请输入用户id");
        String id = scanner.next();
        System.out.println("请输入地址");
        String address = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        Student s = new Student(name, id, address, age);
        boolean flag = true;

        if (!students.add(s)) {
            throw new OperationException("添加失败，学号重复=" + id);
        }else{
            System.out.println("添加成功");
        }
        System.out.println("添加成功");


    }

    /**
     * 根据id删除学生
     */
    public void removeStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String id = scanner.next();
        Student s = null;

        if (students.removeIf(student -> student.getId().equals(id))) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    /**
     * 根据id修改学生信息
     */
    public void setStudent() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = scanner.next();
        boolean flag = false;
        for (Student student : students) {
            if (id.equals(student.getId())) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("未找到该id的学生");
            return;
        }
        System.out.println("请输入姓名");
        String name = scanner.next();
        System.out.println("请输入地址");
        String address = scanner.next();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(name);
                student.setAddress(address);
                student.setAge(age);
                System.out.println("修改成功");
                return;
            }
        }
    }

    /**
     * 查询所有学生
     */
    public void findStudent() {
        if (students.size() == 0) {
            System.out.println("还没有学生，请先添加");
            return;
        }
        students.forEach(System.out::println);
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}
