package com.study.example;

/**
 * 日期 2024/1/22
 * 描述 浮点型细节
 */

public class FloatDetail {

    public static void main(String[] args) {
        //Java浮点常量默认为double，声明float常量需要加“f”，或 “F”
        float n1 = 1.1f;
        double n2 = 1.1;

        //十进制形式：5.12，.512，512.0f(必须有小数点)
        double n3 = .123d;//等价0.123
        System.out.println(n3);

        //科学计数法：5.12e2【5.12*10的2次方】，5.12E-2【5.12/10的2次方】
        double n4 = 5.12e2;
        System.out.println(n4);
        System.out.println(5.12E-2);

        //浮点数使用陷阱:2.7和8.1/3比较
        double n5 = 2.7;
        double n6 = 8.1 / 3;
        System.out.println(n5);//2.7
        System.out.println(n6);//接近2.7的一个小数，而不是2.7

        //得到一个重要的使用点:对运算结果是小数的进行相等判断时，应该是以两个实际的差值的绝对值，在某个精度范围判断
        if (Math.abs(n5 - n6) < 0.0000001) {
            System.out.println("相等");
        }
    }

}
