package com.study.example;

/**
 * 日期 2024/1/28
 * 描述
 */
public class ForExercise01 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("个数为：" + count);
        System.out.println("总和为：" + sum);
    }
}
