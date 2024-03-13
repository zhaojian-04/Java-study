package com.study.example;

/**
 * 日期 2024/1/25
 * 描述 三元运算符细节
 */
public class TernaryOperatorDetail {
    public static void main(String[] args) {
        //表达式1和表达式2要为可以赋给接收变量的类型(或者可以自动转换)
        int a = 3;
        int b = 8;
        int c = a > b ? a : b;
        //int c = a > b ? 1.2 : 1.1;//会保存，类型不匹配
        double d = a > b ? 1.2 : 1.1;//对，也可以进行强转
        System.out.println(c);
    }
}
