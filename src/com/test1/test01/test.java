package com.test1.test01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class test {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("res/a.txt", Charset.forName("GBK"));
             BufferedReader bufferedReader = new BufferedReader(reader);
             EnhanceBufferedReader enhanceBufferedReader = new EnhanceBufferedReader(bufferedReader)) {

            while (enhanceBufferedReader.ready()) {
                String s = enhanceBufferedReader.readLine();
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
