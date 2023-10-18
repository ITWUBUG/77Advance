package com.itheima.day10;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("D:/Ideaproject");
//        createNewFile创建文件A.txt，如果存在就不创建
//        mkdir创建目录
//        mkdirs创建多级目录（文件夹）
//        delete只能删除文件和空文件夹
//        file.isDirectory()是否是目录
//        file.isFile()是否是文件
//        file.list()返回当前目录下的文件名集合
//        file.listFiles()
        try {
//            file.createNewFile();
//            file.mkdir();
//            file.mkdirs();
//            file.delete();

            Arrays.stream(file.list()).forEach(System.out::println);
            Arrays.stream(file.listFiles()).forEach(System.out::println);
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.getName());
            System.out.println(file.exists());//文件是否存在
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
