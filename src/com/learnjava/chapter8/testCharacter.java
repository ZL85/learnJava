package com.learnjava.chapter8;


public class testCharacter {
    //Character类在对象中包装一个基本类型为char的值
    //一个Character类型的对象包含类型为char的单个字段

    //构造方法
    //Character(char value)
    //该类的构造函数必须是一个char类型的数据。通过该构造函数创建的Character类对象包含由char类型参数提供的值。
    //一旦Character类被创建，它包含的数值就不能改变了。
//    Character ch = new Character('a');

    //常用方法
    //方法                                    返回值        功能描述
    //compareTo(Character anotherCharacter)   int          根据数字比较两个Character对象，若这两个对象相等则返回0
    //equals(Object obj)                      boolean      将调用该方法的对象与指定的对象相比较
    //toUpperCase()                           char         将字符参数转换为大写
    //toLowerCase()                           char         将字符参数转换为小写
    //toString()                              String       返回一个表示指定char值的String对象
    //charValue()                             char         返回此Character对象的值
    //isUpperCase(char ch)                    boolean      判断指定字符是否为大写字符
    //isLowerCase(char ch)                    boolean      判断指定字符是否为小写字符

    //常量
    //Character类提供了大量表示特定字符的常量
    //CONNECTOR_PUNCTUATION：返回byte型值，表示Unicode规范中的常规类别“Pc”
    //TITLECASE_LETTER：返回byte型值，表示Unicode规范中的常规类别“Lt”
    //UNASSIGNED：返回byte型值，表示Unicode规范中的常规类别“Cn”

    public static void main(String[] args) {
        Character ch = 'a';
        Character ch1 = 'A';
        System.out.println(Character.compare(ch,ch1));
        System.out.println(ch.equals(ch1));
        System.out.println(ch.toString());
        System.out.println(ch.charValue());
        System.out.println(Character.toUpperCase(ch));
        System.out.println(Character.toLowerCase(ch1));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isLowerCase(ch1));
    }
}
