package com.study.example;

import java.util.Scanner;
/**
 * 日期 2024/1/25
 * 描述 输入
 */
//步骤1
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //步骤2
        Scanner input = new Scanner(System.in);
        //步骤3
        System.out.println("请输入姓名：");
        String name = input.next();
        System.out.println("请输入年龄：");
        int age = input.nextInt();
        System.out.println("请输入：成绩");
        double score = input.nextDouble();
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
    }
}
