package com.itheima.day14.tcp;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try(Socket socket = new Socket("192.168.37.183",8807)){
            String s = "你好";
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(s.getBytes());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
