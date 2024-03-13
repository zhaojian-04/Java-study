package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/28
 * 描述
 */
public class MulForExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                double n = myScanner.nextDouble();
                if (n >= 60) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
