package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/2/4
 * 描述 打印杨辉三角
 */
public class YangHui {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //输入打印行数
        int rows = myScanner.nextInt();
        int[][] arr = new int[rows][];
        for (int i = 0; i < arr.length; i++) {
            //给每个一维数组开空间
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                //每行第一个数和最后一个数是1
                if (j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    //其余的数是前一行的j-1和j的相加得到
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            //打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                //输出杨辉三角
                System.out.printf("%6d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
