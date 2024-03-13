package com.study.example;

/**
 * 日期 2024/1/25
 * 描述 赋值运算符
 */
public class AssignOperator {
    public static void main(String[] args) {
        int n1 = 10;
        n1 += 13;//n1=n1+13
        System.out.println(n1);//23


        //复合运算符会类型转换
        byte b = 3;
        b += 2;//等价 b=(byte)(b+2)
        b++;//等价 b=(byte)(b+1)
    }

}
