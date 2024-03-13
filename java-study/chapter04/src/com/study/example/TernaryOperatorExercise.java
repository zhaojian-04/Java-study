package com.study.example;

/**
 * 日期 2024/1/25
 * 描述 三元运算符练习
 */
public class TernaryOperatorExercise {
    public static void main(String[] args) {
        //实现三个整数最大数
        int n1 = 11;
        int n2 = 33;
        int n3 = 13;
        //1.先得到n1和n2中最大数，保存到max1
        //2.然后求出max1和n3中最大的数，保存到max2
        int max1 = n1 > n2 ? n1 : n2;
        int max2 = max1 > n3 ? max1 : n3;
        System.out.println(max2);//33

        //实现一条语句实现
        int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
        System.out.println(max);//33
    }
}
