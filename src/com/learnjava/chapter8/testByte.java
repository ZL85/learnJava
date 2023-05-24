package com.learnjava.chapter8;

import static java.lang.Byte.parseByte;
import static java.lang.Byte.valueOf;

public class testByte {
    //Byte类将基本类型为byte的值包装在一个对象中
    //一个Byte类型的对象只包含一个类型为byte的字段

    //构造方法
    //Byte(byte value)
    //创建的Byte对象，可表示指定的byte值
//    Byte b = (byte) 45;
    //Byte(String str)
    //创建的Byte对象，可表示String参数所指示的byte值
//    Byte b = new Byte("12");
    //要用数值型String变量作为参数

    //常用方法
    //方法                         返回值        功能描述
    //byteValue()                  byte         以一个byte值返回Byte对象
    //compareTo(Byte anotherByte)  int          在数字上比较两个Byte对象
    //doubleValue()                double       以一个double值返回此Byte的值
    //intValue()                   int          以一个int值返回此Byte的值
    //parseByte()                  byte         将String型参数解析成等价的字节(byte)形式
    //toString()                   String       返回表示此Byte的值的String对象
    //valueOf(String str)          byte         返回一个保存指定String所给出的值的Byte对象
    //equals(Object obj)           boolean      将此对象与指定对象比较，相等返回true；否则返回false

    //常量
    //Byte类中提供了如下4个常量
    //MIN_VALUE：byte类型可取的最小值
    //MAX_VALUE：byte类型可取的最大值
    //SIZE：用于以二进制补码形式表示byte值的位数
    //TYPE：表示基本类型byte的Class实例
    public static void main(String[] args) {
        Byte b = 66;
        Byte b1 = 97;
        System.out.println(b.byteValue());
        System.out.println(b.doubleValue());
        System.out.println(b.intValue());
        System.out.println(b1.toString());
        System.out.println(parseByte("66"));
        System.out.println(valueOf("66"));
        System.out.println(b.compareTo(b1));
        System.out.println(b.equals(b1));
    }
}
