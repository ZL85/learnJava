package com.learnjava.chapter8;

public class testBoolean {
    //Boolean类将基本类型为boolean的值包装在一个对象中
    //一个Boolean类型的对象只包含一个类型为boolean的字段

    //构造方法
    //Boolean(boolean value)创建一个表示value参数的Boolean对象
//    Boolean b = new Boolean(true);
    //Boolean(String str)以String变量作为参数创建Boolean对象
    //如果String参数不为null且在忽略大小写时等于true，则分配一个表示true值的Boolean对象，否则获得一个false值的Boolean对象。
//    Boolean bool = new Boolean("ok");

    //常用方法
    //方法                      返回值                功能描述
    //booleanValue()            boolean              将Boolean对象的值以对应的boolean值返回
    //equals(Object obj)        boolean              判断调用该方法的对象与obj是否相等。当且仅当参数不是null，而且与调用该方法的对象一样都表示同一个boolean值的Boolean对象时，才返回true
    //parseBoolean(String s)    boolean              将字符串参数解析为boolean值
    //toString()                String               返回表示该boolean值的String对象
    //valueOf(String s)         boolean              返回一个用指定的字符串表示值的boolean值

    //常量
    //Boolean提供了以下3个常量：
    //TRUE：对应基值true的Boolean对象
    //FALSE：对应基值false的Boolean对象
    //TYPE：基本类型boolean的Class对象
    public static void main(String[] args) {
        Boolean b1 = true;
        Boolean b2 = false;
        System.out.println("the value of b1 is "+b1.booleanValue());
        System.out.println("the value of b2 is "+b2.booleanValue());
    }
}
