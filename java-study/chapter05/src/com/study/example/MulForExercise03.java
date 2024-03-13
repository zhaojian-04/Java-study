package com.study.example;

import javax.xml.transform.Source;

/**
 * 日期 2024/1/28
 * 描述 打印乘法表
 */
public class MulForExercise03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "\t");
                if (i == j) {
                    System.out.println();
                }
            }


        }
    }
}
