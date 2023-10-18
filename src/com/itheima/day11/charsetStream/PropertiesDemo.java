package com.itheima.day11.charsetStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {


        Properties properties = new Properties();
//        设置属性
        properties.setProperty("email","asd@163.com");
        properties.setProperty("username","as");
        properties.setProperty("password","12346");
        try {
//            store存储本地properites文件 "this is a properties file"文件标题
            properties.store(new FileWriter("res/email.properties"), "this is a properties file");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
