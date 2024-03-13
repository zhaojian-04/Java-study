package com.study.example;

/**
 * 日期 2024/1/28
 * 描述
 */
public class DoWhileExercise02 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        do {
            //判断
            if (i % 5 == 0 && i % 3 != 0) {
                count++;//统计个数
            }
            i++;

        } while (i <= 200);//循环条件
        System.out.println(count);
    }
}
