package com.study.example;

/**
 * 日期 2024/2/1
 * 描述
 */
public class ArrayExercise01 {
    public static void main(String[] args) {
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('A' + i);
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

    }
}
