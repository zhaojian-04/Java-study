package com.study.example;

/**
 * 日期 2024/1/26
 * 描述 进制
 */
public class BinaryTest {
    public static void main(String[] args) {
        int n1 = 0b1011;//二进制
        int n2 = 111;//10进制
        int n3 = 01010;//8进制
        int n4 = 0x10101;//16进制

        //输出为10进制数
        System.out.println(n1);//11
        System.out.println(n2);//111
        System.out.println(n3);//520
        System.out.println(n4);//65793

    }
}
