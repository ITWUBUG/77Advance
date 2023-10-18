package com.itheima.day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

    public static void main(String[] args) {
        try (
                FileInputStream fi = new FileInputStream("res/2e13a5a161d8005c5fa733f3f9579dd.jpg");
                FileOutputStream fo = new FileOutputStream("res/b.jpg")
        ) {

//            1.把内容读取到数据中
//            2.给有效字节数赋值
//            3.判断是否读取完毕
            byte[] bytes = new byte[2046];
            int len = 0;
            while ((len = fi.read(bytes, 0, bytes.length)) != -1) {
//                String s = new String(bytes, 0, len);
//                System.out.println(s);
                fo.write(bytes, 0, len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String srcPath = "D:\\Verysync\\77\\day01\\1static作用于变量.mp4";
        String destPath = "D:\\1static作用于变量.mp4";
        CopyFileUtil.copyFile(srcPath, destPath);


    }

}
