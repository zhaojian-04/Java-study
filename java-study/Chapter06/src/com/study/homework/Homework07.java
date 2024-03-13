package com.study.homework;

/**
 * 日期 2024/2/7
 * 描述 冒泡排序
 */
public class Homework07 {
    public static void main(String[] args) {
        int[] a = {11, 22, 3, 2, 4, 55, 1, 0};
        int temp;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
