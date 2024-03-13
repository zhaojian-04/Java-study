package com.study.example;

/**
 * 日期 2024/2/4
 * 描述
 */
public class TowDimensionalArray05 {
    public static void main(String[] args) {
        int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("和为：" + sum);
    }
}
