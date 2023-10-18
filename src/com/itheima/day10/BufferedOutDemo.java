package com.itheima.day10;

import java.io.*;

public class BufferedOutDemo {
    public static void main(String[] args) {
        try (
                FileOutputStream fo = new FileOutputStream("res/b.txt",true);
//            装饰
             BufferedOutputStream bo = new BufferedOutputStream(fo);
             FileInputStream fi = new FileInputStream("res/b.txt");
             BufferedInputStream bi = new BufferedInputStream(fi)) {
//
//            String s = "aasf";
//            String s1 = "\r\n";
//            bo.write(s.getBytes());
//            bo.write(s1.getBytes());

            byte[] bytes = new byte[1024];
            System.out.println(1);

            int read;
            System.out.println(2);
            while ((read = bi.read(bytes, 0, bytes.length)) != -1) {
                System.out.println(read);
                String s2 = new String(bytes, 0, read);
                System.out.println(s2);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
