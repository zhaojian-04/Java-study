package com.study.example;

/**
 * 日期 2024/1/23
 * 描述 逻辑运算符
 */

public class LogicOperator01 {
    public static void main(String[] args) {
        //&& 和 & 演示
        int age = 50;
        if (age > 20 && age < 90) {
            System.out.println("ok11");
        }

        //&使用
        if (age > 20 & age < 90) {
            System.out.println("ok111");
        }

        //区别
        int a = 4;
        int b = 9;
        //如果第一个条件为false，则第二个条件不会判断，最终结果为false，效率高
        if (a < 1 && ++b < 50) {
            System.out.println("ok22");
        }
        System.out.println("a=" + a + " b=" + b);//4 9

        //不管第一个条件是否为false，第二个条件都要判断，效率低
        if (a < 1 & ++b < 50) {
            System.out.println("ok22");
        }
        System.out.println("a=" + a + " b=" + b);//4 10
    }
}
