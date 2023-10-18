package com.itheima.day02.exercise4;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        usePhone(newPhone);
        OldPhone oldPhone = new OldPhone();
        usePhone(oldPhone);

    }

    /**
     *使用手机
     */
    public static void usePhone(CellPhone cellPhone){
        cellPhone.call();
        cellPhone.send();
        if(cellPhone instanceof NewPhone){
            NewPhone newPhone = (NewPhone) cellPhone;
            newPhone.play();
        }
    }
}
