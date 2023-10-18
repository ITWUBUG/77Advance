package com.itheima.day07.enums;

public class Test {
    public static void main(String[] args) {
        doSomeThingInSeason(2000);
        doSomeThingByEnum(SeasonEnum.SUMMER);
        SeasonEnum summer = SeasonEnum.SUMMER;
        summer.showName();
        SeasonEnum.SUMMER.doSomeThing();
        SeasonEnum.method();

    }

    public static void doSomeThingByEnum(SeasonEnum season) {
//        switch (season) {
//            case SPRING -> System.out.println("春");
//            case SUMMER -> System.out.println("夏");
//            case FALL -> System.out.println("秋");
//            case WINTER -> System.out.println("冬");
//            default -> System.out.println("没有该季节");
//        }
        season.doSomeThing();
    }

    public static void doSomeThingInSeason(int season) {
        switch (season) {
            case 1 -> System.out.println("春");
            case 2 -> System.out.println("夏");
            case 3 -> System.out.println("秋");
            case 4 -> System.out.println("冬");
            default -> System.out.println("没有该季节");

        }
    }


}
