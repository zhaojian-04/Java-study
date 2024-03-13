package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/27
 * 描述
 */
public class IfExercise01 {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        double n1= myScanner.nextDouble();
        double n2= myScanner.nextDouble();
        if(n1>10.0 && n2<20.0){
            System.out.println(n1+n2);
        }
    }
}
