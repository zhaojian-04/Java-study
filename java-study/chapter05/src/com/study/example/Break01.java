package com.study.example;

/**
 * 日期 2024/1/28
 * 描述 break使用
 */
public class Break01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
