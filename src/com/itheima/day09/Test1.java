package com.itheima.day09;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) throws IOException {
//        组合关系可以解耦合：弱化类与类之间的关系
//        耦合：类与类之间有关系
        File file = new File("a.txt");
        file.mkdir();
        System.out.println(file.getAbsolutePath());

        File file1 = new File("ithe34/xian");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);
        System.out.println(file1.getAbsolutePath());

    }
}
