package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/2/3
 * 描述
 */
public class ArrayAdd {
    public static void main(String[] args) {
        //思路分析
        //定义初始数组
        //定义一个新的数组
        //遍历arr数组，依次将arr的元素拷贝到arrNew数组
        //将4赋给arrNew数组，把4赋给arrNew最后一个元素
        //让arr指向arrNew;
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        do {
            int[] arrNew = new int[arr.length + 1];
            System.arraycopy(arr, 0, arrNew, 0, arr.length);
            System.out.println("请输入要添加的元素");

            arrNew[arrNew.length - 1] = myScanner.nextInt();
            arr = arrNew;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            //问用户是否继续
            System.out.println("请输入y/n");
            char ch = myScanner.next().charAt(0);
            if (ch == 'n') {
                break;
            }
        } while (true);
    }
}
