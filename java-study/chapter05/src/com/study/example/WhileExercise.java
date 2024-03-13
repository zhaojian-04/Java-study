package com.study.example;

/**
 * 日期 2024/1/28
 * 描述
 */
public class WhileExercise {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
