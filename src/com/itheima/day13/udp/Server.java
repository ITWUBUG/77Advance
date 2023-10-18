package com.itheima.day13.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 8 * 2
                , 5, TimeUnit.MINUTES, new ArrayBlockingQueue<>(10000));
        try (DatagramSocket datagramSocket = new DatagramSocket(9999)){
            while (true){
                threadPoolExecutor.submit(() ->{
                    try {
                        byte[] bytes = new byte[1024];
                        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
                        datagramSocket.receive(datagramPacket);
                        byte[] data = datagramPacket.getData();
                        System.out.println(new String(data,0,datagramPacket.getLength()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
