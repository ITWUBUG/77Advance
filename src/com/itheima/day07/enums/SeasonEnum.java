package com.itheima.day07.enums;

/**
 * @author admin
 */

//默认继承Enum
public enum SeasonEnum {
//    每一个枚举项都是枚举类对象
//    调用无参构造可以省略()
    SPRING{
    @Override
    public void doSomeThing() {
        System.out.println("春游");
    }
},
    SUMMER("夏"){
        @Override
        public void doSomeThing() {
            System.out.println("夏游");

        }
    },
    FALL(){
        @Override
        public void doSomeThing() {
            System.out.println("秋游");
        }
    },
    WINTER{
        @Override
        public void doSomeThing() {
            System.out.println("冬游");
        }
    };

    private  String name;
//   构造器默认被private修饰
    SeasonEnum(String name) {
        this.name = name;
    }

    SeasonEnum() {
    }
    public void showName(){
        System.out.println(name);
    }
    public static void method(){}
    public abstract void doSomeThing();
}
