package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/1/28
 * 描述
 */
public class Switch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char n = myScanner.next().charAt(0);
        switch (n) {
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期七");
                break;
            default:
                System.out.println("输入的字符不在范围内");
        }
    }
}
