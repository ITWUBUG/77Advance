package com.itheima.day11.work;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) {
        storeProperties();
        loadProperties();

    }

    public static void storeProperties() {
        Properties properties = new Properties();
        properties.setProperty("sender", "zwf@163.com");
        properties.setProperty("addressee", "dinzhen@163.com");
        properties.setProperty("subject", "Hello");
        properties.setProperty("message", "Hello丁真");
        try {
            properties.store(new FileWriter("res/email.properties"), "this is a email properties file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("res/email.properties"));
            properties.forEach((k, v) -> System.out.println(k + ":" + v));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
