package com.study.example;

import java.util.Arrays;

/**
 * 日期 2024/2/1
 * 描述
 */
public class ArrayExercise02 {
    public static void main(String[] args) {
        int[] arr = {4, -1, 9, 88, 23};
        //从小到大排序
        Arrays.sort(arr);
        //输出最大值
        System.out.println(arr[arr.length - 1]);
    }
}
