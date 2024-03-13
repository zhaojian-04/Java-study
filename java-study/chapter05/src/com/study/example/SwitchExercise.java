package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/28
 * 描述
 */
public class SwitchExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char n = myScanner.next().charAt(0);
        switch (n) {
            case 'a':
                System.out.println((char) (n - 32));
                break;
            case 'b':
                System.out.println((char) (n - 32));
                break;
            case 'c':
                System.out.println((char) (n - 32));
                break;
            case 'd':
                System.out.println((char) (n - 32));
                break;
            case 'e':
                System.out.println((char) (n - 32));
                break;
            default:
                System.out.println("other");
        }
    }
}
