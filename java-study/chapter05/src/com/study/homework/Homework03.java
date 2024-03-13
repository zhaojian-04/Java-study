package com.study.homework;

import java.util.Scanner;

/**
 * 日期 2024/2/1
 * 描述 判断闰年
 */
public class Homework03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //输出一个年份
        int year = myScanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}
