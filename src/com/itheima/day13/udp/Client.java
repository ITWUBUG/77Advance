package com.itheima.day13.udp;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try(DatagramSocket datagramSocket = new DatagramSocket()){
            String s = "在吗？？";
            byte[] bytes = s.getBytes();
//            指定接收方的IP+port
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,InetAddress.getByName("192.168.37.179"),9999);
            datagramSocket.send(datagramPacket);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
