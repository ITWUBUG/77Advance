package com.itheima.day06.day05.work;

public class Test {
    public static void main(String[] args) {
        int[] arr = {23, 78, 12, 45, 11, 99};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int i = binarySearch(arr, 12);
        if (i != -1) {
            System.out.println("在数组的" + i + "下标" + "值为" + arr[i]);
        } else {
            System.out.println("没找到");
        }

    }
    public static int binarySearch(int[] arr, int num) {
//        最小最大索引
        int max = arr.length - 1;
        int min = 0;
        int mid;
        while (min <= max) {

            mid = (max + min) >> 1;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
//                在右边变化最小索引
                max = mid - 1;
            } else if (arr[mid] < num) {
//                在左边变化最大索引
                min = mid + 1;
            }
        }
        return -1;
    }


}
