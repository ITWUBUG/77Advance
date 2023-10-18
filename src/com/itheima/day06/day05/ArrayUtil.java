package com.itheima.day06.day05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtil {
    private ArrayUtil() {
    }

    /**
     * 冒泡排序
     *
     * @param arr 数组
     */
    public static void bubbleSort(int[] arr) {
//        外层循环 控制循环次数
        for (int i = 0; i < arr.length - 1; i++) {
//            内层循环 控制比较交换(正序)
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    /**
     * 二分查找
     *
     * @param arr 数组
     * @param num 查找值
     * @return 找到返回索引 没找到返回-1
     */
    public static int binarySearch(int[] arr, int num) {
        bubbleSort(arr);
//        最小最大索引
        int max = arr.length - 1;
        int min = 0;
        int mid;
        while (min <= max) {
//            计算中间索引
//            mid = (max + min) / 2;
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

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 5, 2};
        int i = binarySearch(arr, 3);
        if (i != -1) {
            System.out.println("在数组的" + i + "下标" + "值为" + arr[i]);
        } else {
            System.out.println("没找到");
        }
//        计算机采用大端排序
        System.out.println(4 << 1);
        System.out.println(4 >> 1);

    }
}
