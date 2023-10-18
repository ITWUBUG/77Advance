package com.itheima.day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try (
                FileInputStream fi = new FileInputStream("res/2e13a5a161d8005c5fa733f3f9579dd.jpg");
                FileOutputStream fo = new FileOutputStream("res/b.jpg")
        ) {
//            byte[] bytes = fi.readAllBytes();
//            把字符数组转换成字符串
//            String s = new String(bytes);
//            System.out.println(s);

            byte[] bytes = new byte[2046];
//            int read = fi.read(bytes);
//            int read1 = fi.read(bytes);
//            System.out.println(read);
//            System.out.println(read1);
//
//            String s1 = new String(bytes, 0, read);
//            System.out.println("-------------");
//            String s2 = new String(bytes);
//            System.out.println(s1);
//
//            System.out.println("-------------");
//            System.out.println(s2);
//
//            System.out.println("-------------");
            int len = 0;
            while ((len = fi.read(bytes, 0, bytes.length)) != -1) {
//                String s = new String(bytes, 0, len);
//                System.out.println(s);
                fo.write(bytes,0,len);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
