package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/28
 * 描述
 */
public class MulForExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double sum1;
        double sum2 = 0;
        for (int i = 1; i <= 3; i++) {
            sum1 = 0;
            for (int j = 1; j <= 5; j++) {
                double n = myScanner.nextDouble();
                sum1 += n;
                sum2 += n;
            }
            System.out.println("第" + i + "个班级的平均分为" + sum1 / 5);
        }
        System.out.println("所有班级平均分" + sum2 / 3);
    }
}
