package com.itheima.day03.exercise;

public class Test {
    public static void main(String[] args) {

//        无参无返
        Print print = () -> System.out.println("无参无反");
        print.print();


//      有参无返
        PrintWithParam printWithParam = a -> System.out.println("有参无反" + a);
        printWithParam.print(1);


//        无参有返
        PrintWithValue printWithValue = () -> "无参有返";
        System.out.println(printWithValue.print());


//        有参有返
        PrintWithOneParam printWithOneParam = index -> {
            System.out.println("有参有返" + index);
            return "有参有返" + index;
        };
        System.out.println(printWithOneParam.print(3));

//      有两个参有返回值
        PrintWithTwoParam printWithTwoParam = (str, num) -> {
            System.out.println("String："+str +"\tint:"+ num);
            return "有两个参有返回值";
        };
        System.out.println(printWithTwoParam.print("有两个参有返回值的方法",4 ));


    }
}
