package com.study.example;

/**
 * 日期 2024/2/3
 * 描述 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 12};
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
