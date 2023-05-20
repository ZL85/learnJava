package com.learnjava.chapter3;

public class dataTypeChange {
    public static void main(String[] args) {
        //隐式类型转换
        //从低级类型向高级类型的转换，系统将自动执行
        //类型按精度从低到高排列的顺序为byte < short < int < long < float < double
        byte mybyte = 127;
        short myshort = 150;
        int myint = 1;
        float myfloat = 3.14F;
        double mydouble = 3.15D;
        char mychar = 97;
        System.out.println(mybyte+myshort);
        System.out.println(myshort+myint);
        System.out.println(myint+myfloat);
        System.out.println(myfloat+mydouble);
        System.out.println(mydouble+mychar);

        //强制类型转换
        //(类型名)要转换的值
        int a = (int)3.14;
        System.out.println(a);
        float b = (float)3;
        System.out.println(b);
        int c = (int)'d';
        System.out.println(c);

    }
}

/*
类型转换是将一个值从一种类型更改为另一种类型的过程。
如果从低精度数据类型向高精度数据类型转换，则永远不会溢出，并且总是成功的；
而把高精度数据类型向低精度数据类型转换时，则会有信息丢失，有可能失败。
*/
