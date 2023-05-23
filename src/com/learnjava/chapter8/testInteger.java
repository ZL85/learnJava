package com.learnjava.chapter8;

public class testInteger {
    //java.lang包中的Integer类、Long类和Short类，可将基本类型int、long和short封装成一个类
    //这些类都是Number的子类，区别就是封装了不同的数据类型
    //由于其包含的方法基本相同，所以本节以Integer类为例介绍整数包装类

    //Integer类在对象中包装了一个基本类型int的值

    //构造方法
    //Integer (int number)以一个int型变量为参数来获取Integer对象
    //Integer number = new Integer(7);
    //Integer (String str)以一个String型变量为参数来获取Integer对象
    //Integer number = new Integer("45");
    //要用数值型String变量作为参数，否则将会抛出NumberFormatException异常

    //常用方法
    //方法                               返回值        功能描述
    //byteValue()                        byte         以byte类型返回该Integer的值
    //compareTo(IntegeranotherInteger)   int          在数字上比较两个Integer对象。相等返回0；小于返回负值；大于返回正值
    //equals(Object IntegerObj)          boolean      比较两对象是否相等
    //intValue()                         int          以int型返回此Integer对象
    //shortValue()                       short        以short型返回此Integer对象
    //toString()                         String       返回一个表示该Integer值的String对象
    //valueOf(String str)                Integer      返回保存指定的String值的Integer对象
    //parseInt(String str)               int          返回包含在由str指定的字符串中的数字相应的整型（int）值

    //常量
    //Integer类提供了以下4个常量：
    //MAX_VALUE：表示int类型可取的最大值，即2^31-1
    //MIN_VALUE：表示int类型可取的最小值，即-2^31
    //SIZE：用来以二进制补码形式表示int值的位数
    //TYPE：表示基本类型int的Class实例

    public static void main(String[] args) {
        String[] str = {"11","22","33","44","55"};
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            //Integer类中的parseInt()方法返回与调用该方法的数值字符串相应的整型（int）值。
            int myint = Integer.parseInt(str[i]);
            sum += myint;
        }
        System.out.println("数组中的各元素之和是："+sum);

        String str1 = Integer.toBinaryString(456);
        System.out.println("456的二进制表示为："+str1);

        String str2 = Integer.toOctalString(456);
        System.out.println("456的八进制表示为："+str2);

        String str3 = Integer.toString(456);
        System.out.println("456的十进制表示为："+str3);

        String str4 = Integer.toHexString(456);
        System.out.println("456的十六进制表示为："+str4);

        int maxint = Integer.MAX_VALUE;
        System.out.println("int类型可取的最大值是："+maxint);

        int minint = Integer.MIN_VALUE;
        System.out.println("int类型可取的最小值是："+minint);

        int intsize = Integer.SIZE;
        System.out.println("int类型的二进制位数是："+intsize);
    }
}
