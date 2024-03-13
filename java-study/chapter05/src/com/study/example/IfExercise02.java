package com.study.example;


import java.util.Scanner;

/**
 * 日期 2024/1/27
 * 描述
 */
public class IfExercise02 {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        int n1= myScanner.nextInt();
        int n2= myScanner.nextInt();
        if((n1+n2)%3==0 && (n1+n2)%5==0){
            System.out.println(n1+n2+"是3和5的倍数");
        }else{
            System.out.println(n1+n2+"不是3和5的倍数");
        }
    }
}
