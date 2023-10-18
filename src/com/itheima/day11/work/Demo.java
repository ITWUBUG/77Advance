package com.itheima.day11.work;

import java.io.*;
import java.nio.charset.Charset;

public class Demo {
    public static void main(String[] args) {
//    使用字符流将一个文本中的信息复制到另外一个文本当中去
        try (FileReader reader = new FileReader("res/a.txt", Charset.forName("gbk"));
             BufferedReader bufferedReader = new BufferedReader(reader);
             FileWriter fileWriter = new FileWriter("res/e.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            while(bufferedReader.ready()){
                String s = bufferedReader.readLine();
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
