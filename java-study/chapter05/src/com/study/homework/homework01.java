package com.study.homework;

/**
 * 日期 2024/1/31
 * 描述 过路
 */
public class homework01 {
    public static void main(String[] args) {
        double money = 100000;
        //统计过路口的次数
        int count = 0;

        while (true) {
            if (money > 50000) {
                //money = money - money * 0.05;
                money *= 0.95;
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
