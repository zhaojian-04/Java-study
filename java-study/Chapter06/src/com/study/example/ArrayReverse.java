package com.study.example;

/**
 * 日期 2024/2/3
 * 描述 数组反转
 */
public class ArrayReverse {
    public static void main(String[] args) {
        //数组反转
        int[] arr = {11, 22, 33, 44, 55, 66};
        //规律
        //1.把arr[0]和arr[5]进行交换
        //2.把arr[1]和arr[4]进行交换
        //3.把arr[2]和arr[3]进行交换
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
