package com.itheima.day14.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 65536; i++) {
            try {
                ServerSocket serverSocket = new ServerSocket(i);
            } catch (IOException e) {
                list.add(i);
            }
        }
        System.out.println(list);

    }
}
