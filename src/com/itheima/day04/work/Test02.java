package com.itheima.day04.work;

public class Test02 {
    public static void main(String[] args) {
        String[] arr = {"Abc", "12a", "10", "150", "你好12", "120.0"};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            boolean flag = true;
            for (int j = 0; j < temp.length(); j++) {
                if (!(Character.isDigit(temp.charAt(j))||temp.charAt(j) == '.')) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                double i1 = Double.parseDouble(temp);
                sum += i1;
            }
        }
        System.out.println(sum);
    }
}
