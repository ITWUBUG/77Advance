package com.itheima.day02.interfaces;

public interface Bite {
        //1.接口中主要使用抽象方法,不能有普通方法
        //2.子类实现接口使用implements,而非extends
        //3.接口不能直接实例化,可以通过其子类实例化
        //4.子类如果实现接口,必须实现接口中所有方法
        //5.子类可以实现多个接口
        //6.接口中的成员变量都被final以及public以及static隐式修饰,即都为常量
        //7.接口中可以定义默认方法(java8新增)、静态方法（java8）、私有方法（java9新增）


    void bite();

}
