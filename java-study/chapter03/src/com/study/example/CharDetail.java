package com.study.example;

/**
 * 日期 2024/1/22
 * 描述 字符类型细节
 */
public class CharDetail {
    public static void main(String[] args) {
        //Java中，char的本质是整数，在输出时，是unicode码对应的字符
        char c1 = 97;
        System.out.println(c1);//a

        char c2 = 'a';
        System.out.println((int) c2);//97

        //char类型是可以进行运算的，相当于一个整数，因为它都有对应的Unicode码
        System.out.println('a' + 10);//107
    }
}
