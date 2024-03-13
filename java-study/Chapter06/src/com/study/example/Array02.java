package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/2/1
 * 描述
 */
public class Array02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //开辟数组空间
        double[] scores = new double[5];
        //循环输入
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "成绩");
            scores[i] = myScanner.nextDouble();
        }
        //输出，遍历输出
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
