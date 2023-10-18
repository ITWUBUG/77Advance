package com.itheima.day08.StuMangement1.entity;

import com.itheima.day08.StuMangement1.entity.Student;
import com.itheima.day08.StuMangement1.entity.User;
import com.itheima.day08.StuMangement1.exceptions.OperationException;
import com.itheima.day08.StuMangement1.interfaces.Allpermission;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 单例管理员类
 * 单例模式书写步骤：1.构造器私有化 2.提供静态方法创建对象2.提供一个静态本类属性
 */
public class Admin extends User implements Allpermission {

    /**
     * 用户名
     */
    public static final String USER_ID = "admin";

    /**
     * 密码
     */
    public static final String PASSWORD = "123456";

    private static Admin admin;
    /**
     * 学生集合
     */
    private Set<Student> students = new HashSet<>();


    private Admin(String name, String id) {
        super(name, id);
    }

    public static Admin createSingleton() {
        if (Objects.isNull(admin)) {
            admin = new Admin("summer", "0");
        }
        return admin;
    }

    /**
     * 增加学生
     */
    @Override
    public void add() {

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

        LocalDate now = LocalDate.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format = now.format(dateTimeFormatter);
        s.setEnrollDate(format);

        boolean flag = true;
        if (!students.add(s)) {
            throw new OperationException("添加失败，学号重复=" + id);
        } else {
            System.out.println("添加成功");
        }
    }

    /**
     * 根据id删除学生
     */
    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String id = scanner.next();
        if (!students.removeIf(student -> student.getId().equals(id))) {
            throw new OperationException("删除失败，学号不存在id=" + id);
        }
    }

    /**
     * 根据id修改学生信息
     */
    @Override
    public void update() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = scanner.next();
//        findAny finFirst
        Optional<Student> any = students.stream().filter(o -> o.getId().equals(id)).findAny();

        if (any.isEmpty()) {
            throw new OperationException("更新失败，学号不存在=" + id);
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
    @Override
    public void query() {
        if (students.size() == 0) {
            System.out.println("还没有学生，请先添加");
            return;
        }
        students.forEach(System.out::println);
    }


    /**
     * 存储学生
     */
    public void saveData() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("res/sysStu.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 读取学生
     */
    public void readData() {
        File file = new File("res/sysStu.txt");
//        第一次登录判断系统中是否在学生文件中
        if (!file.exists()) {
            return;
        }
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Object o = objectInputStream.readObject();
            students = (Set<Student>) o;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
