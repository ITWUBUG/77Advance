package com.itheima.day11.charsetStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("res/c.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("123456");
            bufferedWriter.newLine();
            bufferedWriter.write("asdfas");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
