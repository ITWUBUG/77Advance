package com.itheima.day11.charsetStream;

import java.io.*;

public class ObjectOutputDemo {
    public static void main(String[] args) {
        try (FileOutputStream fileWriter = new FileOutputStream("res/d.txt",true);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileWriter)) {
            Student student = new Student("王五", 18);
            objectOutputStream.writeObject(student);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
