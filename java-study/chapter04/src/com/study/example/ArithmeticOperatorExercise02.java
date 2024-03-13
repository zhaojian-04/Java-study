package com.study.example;

/**
 * 日期 2024/1/23
 * 描述 算术运算符练习
 */
public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        int i1=10;
        int i2=20;
        int i=i1++;
        System.out.println(i);//10
        System.out.println(i1);//11
        System.out.println(i2);//20
        i=--i2;
        System.out.println(i);//19
        System.out.println(i2);//19
    }
}
