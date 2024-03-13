package com.study.example;

/**
 * 日期 2024/1/21
 * 描述 变量的注意事项
 */
public class VarDetail {
    public static void main(String[] args) {
        //变量必须先声明，后使用,有顺序
        int a = 11;
        System.out.println(a);
        //该区域的数据值可以在同一类型范围内不断变化
        a = 1000;
        System.out.println(a);
    }
}
