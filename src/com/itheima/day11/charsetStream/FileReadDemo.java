package com.itheima.day11.charsetStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReadDemo {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("res/a.txt",Charset.forName("gbk"))) {
            int read;
            char[] chars = new char[1024];
            String s = "";
            while ((read = reader.read(chars, 0, chars.length)) != -1) {
                s = new String(chars, 0, read);
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
