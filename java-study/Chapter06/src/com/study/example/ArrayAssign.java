package com.study.example;

/**
 * 日期 2024/2/1
 * 描述 数组赋值机制
 */
public class ArrayAssign {
    public static void main(String[] args) {
        //基本数据类型赋值
        int n1 = 10;
        int n2 = n1;
        n2 = 80;
        System.out.println(n1);//10
        System.out.println(n2);//80

        //数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用传达
        //是一个地址，arr2变化会影响到arr1
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;//把arr1赋给arr2
        arr2[0] = 10;
    }
}
