package com.study.example;

/**
 * 日期 2024/2/4
 * 描述 二维数组
 */
public class TowDimensionalArray01 {
    public static void main(String[] args) {
        //二维数组就是原来的一维数组的每个元素是一维数组，就构成二维数组
        int[][] arr = {{0, 0, 0, 0}, {1, 1, 1, 1}, {2, 2, 2, 2}};
        //输出二维数组
        for (int i = 0; i < arr.length; i++) {
            //遍历二维数组的每个元素
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
