package com.learnjava.chapter8;

public class testDouble {
    //Double和Float包装类是对double、float基本类型的封装，它们都是Number类的子类，又都是对小数进行操作
    //Double类在对象中包装一个基本类型为double的值
    //每个Double类的对象都包含一个double类型的字段

    //构造方法
    //Double(double value)：基于double参数创建Double类对象
    //Double(String str)：构造一个新分配的Double对象，表示用字符串表示的double类型的浮点值

    //常用方法
    //方法                  返回值             功能描述
    //byteValue()           byte              以byte形式返回Double对象值（通过强制转换）
    //compareTo(Double d)   int               对两个Double对象进行数值比较。相等返回0；小于返回负值；大于返回正值
    //equals(Object obj)    boolean           将此对象与指定的对象相比较
    //intValue()            int               以int形式返回double值
    //isNaN()               boolean           如果此double值是非数字(NaN)，则该回true；否则返false
    //toString()            String            返回此Double对象的字符串表示形式
    //valueOf(String str)   Double            返回保存用参数字符串str表示的double值的Double对象
    //doubleValue()         double            以double形式返回此Double对象
    //longValue()           long              以long形式返回此double的值（通过强制转换为long类型)

    //常量
    //Double类提供了以下常量
    //MAX_EXPONENT：返回int值，表示有限double变量可能具有的最大指数
    //MIN_EXPONENT：返回int值，表示标准化double变量可能具有的最小指数
    //NEGATIVE_INFINITY：返回double值，表示保存double类型的负无穷大值的常量
    //POSITIVE_INFINITY：返回double值，表示保存double类型的正无穷大值的常量
    public static void main(String[] args) {
        Double d = 3.14;
        Double d1 = 2.17;
        System.out.println(d.byteValue());
        System.out.println(d.compareTo(d1));
        System.out.println(d.equals(d1));
        System.out.println(d.intValue());
        System.out.println(d.isNaN());
        System.out.println(d.toString());
        System.out.println(Double.valueOf("3.14"));
        System.out.println(d1.doubleValue());
        System.out.println(d1.longValue());
    }
}
