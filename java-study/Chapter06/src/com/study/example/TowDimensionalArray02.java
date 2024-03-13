package com.study.example;

/**
 * 日期 2024/2/4
 * 描述
 */
public class TowDimensionalArray02 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[1][1] = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
