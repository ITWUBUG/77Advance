package com.itheima.day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
//            1.追加写入  能自动创建文件
            fileOutputStream = new FileOutputStream("res/a.txt",true);
            String s = "asfasfasf";
//            2.换行
            String s1 = "\r\n";
            byte[] bytes = s.getBytes();
            byte[] bytes1 = s1.getBytes();

            fileOutputStream.write(bytes);
            fileOutputStream.write(bytes1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (Objects.nonNull(fileOutputStream)) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
