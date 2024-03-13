package com.study.example;

/**
 * 日期 2024/2/1
 * 描述 数组
 */
public class Array01 {
    public static void main(String[] args) {
        //有五个学生，他们英语成绩分别为60,70,90,80,50用程序求几个同学总成绩是多少，平均分多少？
        //传统方式：
        double s1 = 60;
        double s2 = 70;
        double s3 = 90;
        double s4 = 80;
        double s5 = 50;
        double sum = s1 + s2 + s3 + s4 + s5;
        double avg = sum / 5;
        System.out.println("总成绩为："+ sum + ", 平均成绩为："+ avg);

        //以上这种方式难免有些繁琐了，我们使用数组可以很简单的解决这个问题。
        //1.定义一个double类型的数组，把成绩存到数组中
        double[] arrays = {60,70,90,80,50};
        //2.数组是从0开始，所以下标为arrays[0]就是第一个数；第二个数就是arrays[1],以此类推...
        //3.通过for循环可以访问数组的5个元素值
        double sum2 = 0;
        for(int i = 0 ; i < arrays.length ; i++){
            sum2 += arrays[i];
        }
        System.out.println("总成绩为："+ sum2 + ", 平均成绩为："+ sum2/arrays.length);

    }
}
