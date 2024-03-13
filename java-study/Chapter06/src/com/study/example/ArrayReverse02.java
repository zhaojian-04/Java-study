package com.study.example;

/**
 * 日期 2024/2/3
 * 描述
 */
public class ArrayReverse02 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        //创建一个空的且同等大小的数组
        int[] arr2 = new int[arr.length];
        //逆序遍历
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr[i];
        }
        //当for循环结束，arr2就是一个逆序的数组{66，55，44，33，22，11}
        //让arr指向arr2数据空间，此时arr原来的数据空间就没有变量引用
        //会被当做垃圾，销毁
        arr = arr2;
        //输出arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
