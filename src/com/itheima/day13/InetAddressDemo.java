package com.itheima.day13;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
//            获取主机地址
            System.out.println(localHost.getHostAddress());
//            获取主机名
            System.out.println(localHost.getHostName());
            System.out.println("--------------");
            InetAddress[] allByName = InetAddress.getAllByName("DESKTOP-IAVB212");
            for (InetAddress inetAddress : allByName) {
                System.out.println(inetAddress.getHostName() + ":" + inetAddress.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
