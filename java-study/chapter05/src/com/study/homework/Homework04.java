package com.study.homework;

import java.util.Scanner;

/**
 * 日期 2024/2/1
 * 描述 判断水仙花数
 */
public class Homework04 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //输入一个整数
        int num = myScanner.nextInt();
        //等量替换
        int t = num;
        int sum = 0, s;
        while (t != 0) {
            //求各个位数的数字
            s = t % 10;
            t /= 10;
            //各个位数的3次方相加
            sum += Math.pow(s, 3);
        }
        //判断是否和本身相等
        if (sum == num) {
            System.out.println(num + "是水仙花数");
        }
    }
}
