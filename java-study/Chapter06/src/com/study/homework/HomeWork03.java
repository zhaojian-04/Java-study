package com.study.homework;

import java.util.Scanner;

/**
 * 日期 2024/2/7
 * 描述 查找加扩容
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr1 = {10, 12, 45, 90};
        int[] arr2 = new int[arr1.length + 1];
        int num1 = myScanner.nextInt();
        int index = 0;
        //找到该插入的位置
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > num1) {
                index = i;
                break;
            }
        }
        //数组扩容
        for (int i = 0, j = 0; i < arr2.length; i++) {
            if (index != i) {
                arr2[i] = arr1[j];
                j++;
            } else {
                arr2[i] = num1;
            }

        }
        //将arr2的地址赋给arr1
        arr1 = arr2;
        //数组打印
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }
}
