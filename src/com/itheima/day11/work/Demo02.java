package com.itheima.day11.work;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
             fileWriter = new FileWriter("res/e.txt");
             fileWriter.write("asfdasdf");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
