package com.itheima.day03.inner;

import com.itheima.day02.exercise3.KunKun;
import com.itheima.day02.exercise3.Sing;

public class Test {
    public static void main(String[] args) {
//        内部类创建对象(不常用)
//        Outer.Inner inner = new Outer().new Inner();
//        inner.show();
        Outer outer = new Outer();
        outer.showInner();
        outer.method();

//        匿名对象，只能用一次
        new KunKun("张三").dance();
        KunKun kun =new KunKun("李四");
        kun.dance();
        kun.rap();
//        匿名内部类：其实就是接口和普通类的一个子类
        Sing sing = new Sing() {
            String song ="千里之外" ;
            @Override
            public void sing() {
                System.out.println(song);
            }
        };
        sing.sing();
    }
}
