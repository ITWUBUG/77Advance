package com.itheima.day14.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8807)){
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            byte[] bytes = new byte[1024];
            int read;
            while ((read = inputStream.read(bytes,0, bytes.length)) != -1){
                System.out.println(new String(bytes,0,read) );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
