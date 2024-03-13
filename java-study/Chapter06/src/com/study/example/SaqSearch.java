package com.study.example;

import java.util.Scanner;

/**
 * 日期 2024/2/4
 * 描述 查找
 */
public class SaqSearch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //定义数组
        String[] arr = {"喜羊羊", "沸羊羊", "美羊羊", "懒洋洋"};
        //输入要查找的数据
        //编程思想
        int index = -1;
        String sheep = myScanner.next();
        for (int i = 0; i < arr.length; i++) {
            //比较两个字符串是否相等(相同)
            if (arr[i].equals(sheep)) {
                System.out.println("找到了下标为 " + i);
                //找到变一
                index = 1;
                break;
            }
        }
        //没有找到
        if (index != 1) {
            System.out.println("没有找到");
        }
    }
}
