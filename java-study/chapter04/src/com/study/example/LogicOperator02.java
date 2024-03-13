package com.study.example;

/**
 * 日期 2024/1/23
 * 描述
 */
public class LogicOperator02 {
    public static void main(String[] args) {
        // 短路或|| 和逻辑或 | 演示
        int age = 50;
        if (age > 20 || age < 90) {
            System.out.println("ok11");//ok11
        }

        // | 使用
        if (age > 20 | age < 90) {
            System.out.println("ok111");//ok111
        }


        //区别
        //如果第一个条件为true,则第二个条件不会判断，最终结果为true，效率高
        int a = 4;
        int b = 9;
        if (a > 1 || ++b > 4) {
            System.out.println("ok333");
        }
        System.out.println("a=" + a + " b=" + b);//4 9

        //不管第一个条件是否为true，第二个条件都要判断，效率低
        if (a > 1 | ++b > 4) {
            System.out.println("ok334");
        }
        System.out.println("a=" + a + " b=" + b);//4 10

    }
}
