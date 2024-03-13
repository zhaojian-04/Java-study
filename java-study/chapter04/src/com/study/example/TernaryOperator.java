package com.study.example;

/**
 * 日期 2024/1/25
 * 描述 三元运算符
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        int result = a > b ? a++ : b--;
        int result1 = a > b ? a++ : --b;
        System.out.println(result);//99
        System.out.println(result1);//97
    }
}
