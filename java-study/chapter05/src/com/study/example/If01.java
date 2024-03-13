package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/27
 * 描述 if语句
 */
public class If01 {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        int age= myScanner.nextInt();
        if(age>=18){
            System.out.println("你成年了");
        }
    }
}
