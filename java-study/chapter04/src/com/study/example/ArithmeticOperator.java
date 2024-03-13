package com.study.example;

import java.util.Spliterator;

/**
 * 日期 2024/1/23
 * 描述 算数运算符的使用
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        //除法的使用
        System.out.println(10/4);//从数学看来是2.5，java中是2,计算是整数
        System.out.println(10.0/4);//java中是2.5,计算结果是浮点数
        double d=10/4;//java中10/4=2，2 => 2.0
        System.out.println(d);

        // %取摸
        //在%的本质看一个公式 a%b=a-a/b*b
        //取余的符号取决于被除数
        System.out.println(10%3);//1
        System.out.println(-10%3);//-1
        System.out.println(10%-3);//1
        System.out.println(-10%-3);//-1

        // 自增++的使用
        int i=10;
        i++;//等价于i=i+1;
        ++i;//等价于i=i+1;
        System.out.println("i="+i);//12

        int j=8;
        int n=8;
        int k=++j;//等价 j=j+1;k+j;
        int a=n++;//等价 a=n;n=n+1
        System.out.println(k+" "+j);//9 9
        System.out.println(a+" "+n);//8 9
    }
}
