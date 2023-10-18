package com.itheima.test;

import ch.qos.logback.classic.spi.EventArgUtil;

import java.io.*;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.HashMap;

public class Test03 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("res/a.txt", Charset.forName("GBK"));
             BufferedReader bufferedReader = new BufferedReader(reader);
             BufferedReadEnhance bufferedReadEnhance = new BufferedReadEnhance(bufferedReader)) {

            while(bufferedReadEnhance.ready()){
                String s = bufferedReadEnhance.readLine();
                System.out.println(s);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
