package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/2/3
 * 描述
 */
public class ArrayReduce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner myScanner = new Scanner(System.in);
        do {
            int[] arrNew = new int[arr.length - 1];
            System.arraycopy(arr, 0, arrNew, 0, arrNew.length);

            arr = arrNew;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            //问用户是否继续
            System.out.println("请输入y/n");
            char ch = myScanner.next().charAt(0);
            if (arr.length == 1) {
                System.out.println("不能再缩减了");
                break;
            }
            if (ch == 'n') {
                break;
            }


        } while (true);

    }
}
