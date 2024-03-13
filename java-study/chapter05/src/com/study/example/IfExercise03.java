package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/27
 * 描述
 */
public class IfExercise03 {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        int year= myScanner.nextInt();
        if(year %4==0 && year%100!=0 || year%400==0){
            System.out.println("是闰年");
        }else{
            System.out.println("不是闰年");
        }
    }
}
