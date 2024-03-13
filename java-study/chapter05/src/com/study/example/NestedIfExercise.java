package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/28
 * 描述
 */
public class NestedIfExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int month = myScanner.nextInt();
        int age = myScanner.nextInt();
        int price;
        if (month >= 4 && month <= 10) {
            if (age > 60) {
                price = 60 / 3;
            } else if (age >= 18) {
                price = 60;
            } else {
                price = 60 / 2;
            }
        } else {
            if (age >= 18) {
                price = 40;
            } else {
                price = 20;
            }
        }
        System.out.println(price);
    }
}
