package com.study.homework;

/**
 * 日期 2024/2/1
 * 描述 输出小写的a-z以及大写的Z-A;
 */
public class Homework07 {
    public static void main(String[] args) {
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i);
        }
        System.out.println();
        for (int i = 90; i >= 65; i--) {
            System.out.print((char) i);
        }

    }
}
