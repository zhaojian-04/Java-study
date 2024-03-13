package com.study.example;

/**
 * 日期 2024/2/1
 * 描述
 */
public class ArrayCopy {
    public static void main(String[] args) {
        //将int[] arr1 = {11,22,33}；拷贝到arr2数组中
        int[] arr1 = {11, 22, 33};
        int[] arr2 = new int[arr1.length];

        //把arr1的所有元素赋到arr2中
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
