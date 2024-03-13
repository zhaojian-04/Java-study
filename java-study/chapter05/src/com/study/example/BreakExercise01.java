package com.study.example;

/**
 * 日期 2024/1/28
 * 描述
 */
public class BreakExercise01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 20) {
                break;
            }
        }
        System.out.println(sum);
    }
}
