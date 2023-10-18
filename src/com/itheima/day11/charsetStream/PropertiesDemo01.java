package com.itheima.day11.charsetStream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo01 {
    public static void main(String[] args) {

        Properties properties = new Properties();

        try {
//            load加载本地properties文件
            properties.load(new FileReader("res/email.properties"));
            properties.forEach((k, v) -> System.out.println(k + ":" + v));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
