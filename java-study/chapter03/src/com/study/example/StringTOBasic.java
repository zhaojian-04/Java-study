package com.study.example;

/**
 * 日期 2024/1/23
 * 描述 基本数据类型和String类型的转换
 */
public class StringTOBasic {
    public static void main(String[] args) {
        //基本类型转String
        int n1 = 100;
        float f1 = 1.1F;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

        //String转基本数据类型
        String n = "123";
        int num1 = Integer.parseInt(n);
        double num2 = Double.parseDouble(n);
        System.out.println(num1);
        System.out.println(num2);

        //把字符串转成字符char -> 含义是指 把字符串的第一个字符得到
        System.out.println(n.charAt(0));
    }
}
