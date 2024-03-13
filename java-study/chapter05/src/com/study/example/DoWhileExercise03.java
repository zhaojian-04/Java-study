package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/28
 * 描述
 */
public class DoWhileExercise03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char n;
        do {
            System.out.println("还钱吗？y/n");
            n = myScanner.next().charAt(0);
        } while (n == 'n');
    }

}
