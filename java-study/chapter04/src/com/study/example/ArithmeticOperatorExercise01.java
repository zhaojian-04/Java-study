package com.study.example;

/**
 * 日期 2024/1/23
 * 描述 算数运算符练习
 */
public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {
        int a=2;//i->1
        a=a++;//规则使用临时变量：（1）temp=a;(2)a=a+1;(3)a=temp;
        System.out.println(a);//1

        int j=1;
        j=++j;
        System.out.println(j);//2
    }
}
