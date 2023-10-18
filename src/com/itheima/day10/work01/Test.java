package com.itheima.day10.work01;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        copyFile("D:/Verysync/day07/01-面向对象的思想.mp4","D:/a.mp4");

    }
    /**
     * 文件复制
     * @param srcPath 源路径
     * @param destPath 目标路径
     */
    public static void copyFile(String srcPath,String destPath){
        try (
                FileInputStream fi = new FileInputStream(srcPath);
                BufferedInputStream bi = new BufferedInputStream(fi);
                FileOutputStream fo = new FileOutputStream(destPath);
                BufferedOutputStream bo = new BufferedOutputStream(fo)) {
            byte[] bytes = new byte[1024];
            int read;
            while ((read = bi.read(bytes, 0, bytes.length)) != -1) {
                bo.write(bytes,0,read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
