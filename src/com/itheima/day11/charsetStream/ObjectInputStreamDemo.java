package com.itheima.day11.charsetStream;

import java.io.*;

public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("res/d.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
//            Object o = objectInputStream.readObject();
//            System.out.println(o);
            while (fileInputStream.available() > 0){//代表文件中还有内容
                Object obj = objectInputStream.readObject();
                System.out.println(obj);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        //分开写，后面要用到，来做循环终止条件
//        FileInputStream fileInputStream = new FileInputStream("file.txt");
//        ObjectInputStream in = new ObjectInputStream(fileInputStream);
//        //使用反序列化流利用循环来打印文件中的内容
//        while (fileInputStream.available() > 0){//代表文件中还有内容
//            Object obj = in.readObject();
//            Student s = (Student) obj;
//            System.out.println(s);
//        }
//        in.close();
//    }
}
