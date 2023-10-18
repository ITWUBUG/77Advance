package com.itheima.day10.exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
//        装饰模式：灵活增强一个类的功能 （可插拔）
//        1.需要一个增强类
//        2.实现或者功能接口/类
//        3.重写接口方法
//        4.组合需要增强的类
        Hero hero = new Hero();
        HeroEnhance heroEnhance = new HeroEnhance(hero);
        heroEnhance.a();

        try( FileOutputStream fos = new FileOutputStream(new File("itheima"));) {

            fos.write("asdf".getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
