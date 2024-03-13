package com.study.homework;

import java.util.SortedMap;

/**
 * 日期 2024/2/1
 * 描述 求出1-1/2+1/3-1/4...1/100;
 */
public class Homework08 {
    public static void main(String[] args) {
        double sum = 1;
        int g = -1;
        for (int i = 2; i <= 100; i++) {
            sum += g * 1.0 / i;
            //改变正负号符号
            g = -g;
        }
        System.out.println(sum);
    }
}
