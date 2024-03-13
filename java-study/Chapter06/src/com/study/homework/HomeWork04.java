package com.study.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 日期 2024/2/7
 * 描述 扩容加冒泡
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr1 = {10, 12, 45, 90};
        int[] arr2 = new int[arr1.length + 1];
        int num1 = myScanner.nextInt();
        //数组扩容
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr1.length] = num1;
        arr1 = arr2;
        //数组排序
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}
