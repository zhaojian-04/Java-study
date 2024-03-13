package com.study.example;

import java.util.Scanner;
import java.util.Spliterator;

/**
 * 日期 2024/1/28
 * 描述
 */
public class SwitchExercise03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int month = myScanner.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("请输入正确的月份");
        }
    }
}
