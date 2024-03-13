package com.study.homework;

/**
 * 日期 2024/2/7
 * 描述
 */
public class HomeWork05 {
    public static void main(String[] args) {
        int[] a = new int[10];
        double pjs;
        int sum = 0;
        //随机生成10个整数存入数组中
        for (int i = 0; i < a.length; i++) {
            //生成随机数
            a[i] = (int) (Math.random() * 100) + 1;
            System.out.print(a[i] + "\t");
            sum += a[i];
        }
        System.out.println();


        //倒序输出数组
        System.out.println("倒序输出");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + "\t");
        }
        //输出平均值
        System.out.println("\n" + "平均数为：" + sum / 10);

        //求最大值,最小值及其下标
        int max = a[0];
        int min = a[0];
        int under1 = 0;
        int under2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                under1 = i;
            }
            if (a[i] < min) {
                min = a[i];
                under2 = i;
            }
        }
        System.out.println("最大值：" + max + " 下标是：" + under1);
        System.out.println("最小值：" + min + " 下标是：" + under2);

        //查找是否有8
        int f = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 8) {
                System.out.println("找到了");
                f = 1;
                break;
            }
        }
        if (f == -1) {
            System.out.println("没有找到");
        }
    }

}
