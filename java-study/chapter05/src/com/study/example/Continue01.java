package com.study.example;

/**
 * 日期 2024/1/28
 * 描述
 */
public class Continue01 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4) {
            i++;
            if (i == 2) {
                continue;
            }
            System.out.println("i=" + i);
        }
    }

}
