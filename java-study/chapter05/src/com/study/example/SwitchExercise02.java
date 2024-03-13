package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/28
 * 描述
 */
public class SwitchExercise02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int score = myScanner.nextInt();
        if (score >= 0 && score <= 100) {
            switch (score / 60) {
                case 1:
                    System.out.println("合格");
                    break;
                default:
                    System.out.println("不合格");
            }
        } else {
            System.out.println("请输入正确的分数范围");
        }

    }
}
