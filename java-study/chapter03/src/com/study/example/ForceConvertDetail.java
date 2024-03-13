package com.study.example;

/**
 * 日期 2024/1/23
 * 描述  强制类型转换细节
 */
public class ForceConvertDetail {
    public static void main(String[] args) {
        //强制符号只针对于最近的操作数有效，往往会使用小括号提升优先级
        //int x = (int)10 * 3.5 + 6 * 11;错误，double ——> int
        int y = (int) (10 * 3.5 + 6 * 11);
        System.out.println(y);//101


        char c1 = 100;//ok
        int m = 100;//ok
        //char c2 = m;//错误
        char c3 = (char) m;//ok
        System.out.println(c3);//100对应的ASCII字符
    }
}
