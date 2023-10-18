package com.itheima.day01.Static;

public class Key {

    /**
     * 大门钥匙
     */
    public static String publicKey = "123456";

    /**
     * 各个房间钥匙
     */
    private String homeKey;

    /**
     * 钥匙持有人
     */
    private String host;

    public Key(String homeKey, String host) {
        this.homeKey = homeKey;
        this.host = host;
    }

    public Key() {
    }

    public void method(){
        System.out.println(publicKey);
        method1();
    }

    public static void method1(){
        System.out.println(publicKey);
//        静态方法只能访问静态的成员
//        System.out.println(homeKey);
//        method();
    }

    public String getHomeKey() {
        return homeKey;
    }

    public void setHomeKey(String homeKey) {
        this.homeKey = homeKey;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

}
