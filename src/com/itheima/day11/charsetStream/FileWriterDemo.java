package com.itheima.day11.charsetStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("res/a.txt",true)) {
            String s = "在吗";
            fileWriter.write("\r\n");
            fileWriter.write(s);
            fileWriter.write(s);
            fileWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
