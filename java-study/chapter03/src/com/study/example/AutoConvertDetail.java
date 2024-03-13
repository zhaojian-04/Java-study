package com.study.example;

/**
 * 日期 2024/1/22
 * 描述 自动转换数据类型细节
 */
public class AutoConvertDetail {
    public static void main(String[] args) {
        //1. 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
        int a = 12;
        //float b = a + 1.2; //错误，a+1.2 -->结果类型是double
        double d = a + 1.3; //正确 a+1.3 --> 结果类型double
        float c = a + 1.5F; //正确 a+1.5F --> 结果类型是float

        //2.把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时，就会报错，反之就会进行自动类型转换
        //int aa = 11.2; 错误 double --> int

        //3.(byte,short)和char之间不会相互自动转换
        byte bb = 126; //正确 -128 ~ 127
        int n2 = 1;//n2是int
        //byte bbb = n2; //错误，原因是变量赋值，判断类型
        //char c1=bb;//错误，原因byte不能自动转成char

        //4.byte，short，char 三者可以计算，计算时首先转换为int类型
        byte b2 = 1;
        short s1 = 1;
        //short cc = b2 + s1;错误，b2+s1 => int
        int cc = b2 + s1;
    }
}
