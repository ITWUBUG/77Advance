package com.itheima.day10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

public class TryWithResDemo {
    public static void main(String[] args) {

//        文本分类：纯文本 只存字符串 如:txt，java
//                富文本 存图片 ppt docx xlxs md

//        可以自动关闭流的try（语法糖）
        try (FileOutputStream fileOutputStream = new FileOutputStream("res/a.txt",true)){
            String s = "asfasfasf123";
//            2.换行
            String s2 = "\r\n";
            byte[] bytes = s.getBytes();
            byte[] bytes1 = s2.getBytes();

            fileOutputStream.write(bytes);
            fileOutputStream.write(bytes1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
























}
