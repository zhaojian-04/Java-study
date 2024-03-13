package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/28
 * 描述
 */
public class Stars {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n * 2) / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || i == n) {//第一个和最后一个输出
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
