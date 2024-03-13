package com.stduy.example;

/**
 * 日期 2024/1/15
 * 描述 转义字符
 */
public class ChangeChar {
    public static void main(String[] args) {
        // \t制表位
        System.out.println("北京\t天津\t上海");

        // \n换行符
        System.out.println("jacksmith\njason");

        // \\ 一个\
        System.out.println("C:\\windows\\system32\\cmd.exe");

        // \" 一个”
        System.out.println("\"要好好学习\"");

        // \' 一个’
        System.out.println("'你是什么牛马'");

        // \r 一个回车
        System.out.println("2024年1月15\r日");
    }
}
