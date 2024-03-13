package com.study.example;

/**
 * 日期 2024/2/4
 * 描述
 */
public class TowDimensionalArray03 {
    public static void main(String[] args) {
        //列数不确定时的初始化方式
        int[][] arr = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[3];
    }
}
