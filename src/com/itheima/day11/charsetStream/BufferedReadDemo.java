package com.itheima.day11.charsetStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class BufferedReadDemo {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("res/a.txt", Charset.forName("gbk"));
             BufferedReader bufferedReader = new BufferedReader(reader)) {
//            ready搭配readLine
            while (bufferedReader.ready()){
                String s = bufferedReader.readLine();
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
