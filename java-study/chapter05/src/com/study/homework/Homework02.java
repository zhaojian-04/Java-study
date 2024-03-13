package com.study.homework;

import java.util.Scanner;

/**
 * 日期 2024/2/1
 * 描述 判断整数属于哪个范围
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //输入一个整数
        int num = myScanner.nextInt();
        if (num > 0) {
            System.out.println("大于0");
        } else if (num < 0) {
            System.out.println("小于0");
        } else {
            System.out.println("等于0");
        }
    }
}
