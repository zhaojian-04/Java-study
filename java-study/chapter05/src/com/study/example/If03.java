package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/28
 * 描述
 */
public class If03 {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        int n= myScanner.nextInt();
        if(n==100){
            System.out.println("信用极好");
        }else if(n>80){
            System.out.println("信用优秀");
        }else if(n>=60){
            System.out.println("信用一般");
        }else{
            System.out.println("信用不及格");
        }
    }
}
