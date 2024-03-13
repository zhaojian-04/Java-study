package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/27
 * 描述
 */
public class If02 {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        int age= myScanner.nextInt();
        if(age>=18){
            System.out.println("你成年了");
        }else{
            System.out.println("你没有成年");
        }
    }
}
