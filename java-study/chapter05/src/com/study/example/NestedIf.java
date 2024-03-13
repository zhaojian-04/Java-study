package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/28
 * 描述
 */
public class NestedIf {
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        double score= myScanner.nextDouble();
        char gender=myScanner.next().charAt(0);
        if(score>8.0){
            if(gender=='男'){
                System.out.println("进入男子组决赛");
            }else if(gender=='女'){
                System.out.println("进入女子组决赛");
            }
        }else{
            System.out.println("没有进入决赛");
        }
    }
}
