package com.learnjava.chapter7;

import java.util.Scanner;

public class object {
    //对象可以认为是在一类事物中抽象出某一个特例，可以通过这个特例来处理这类事物出现的问题
    //在Java语言中通过new操作符来创建对象
    //每实例化一个对象就会自动调用一次构造方法，实质上这个过程就是创建对象的过程
    //可以在Java语言中使用new操作符调用构造方法创建对象
//    Test test = new Test("a");
//    Test    类名
//    test    创建Test类对象名
//    new     创建对象操作符
//    "a"     构造方法参数
    //test对象被创建出来时，就是一个对象的引用，这个引用在内存中为对象分配了存储空间
    //可以在构造方法中初始化成员变量，当创建对象时，自动调用构造方法
    //也就是说，在Java语言中初始化与创建是被捆绑在一起的
    //每个对象都是相互独立的，在内存中占据独立的内存地址，并且每个对象都具有自己的生命周期
    //当一个对象的生命周期结束时，对象就变成垃圾，由Java虚拟机自带的垃圾回收机制处理，不能再被使用
    //用户使用new操作符创建一个对象后，可以使用“对象.类成员”来获取对象的属性(成员变量)和行为(方法)
    //引用只是存放一个对象的内存地址，并非存放一个对象

    public object() {
        System.out.println("创建对象");
    }
    public static void main(String[] args) {
//        调用Scanner类创建一个对象sc
//        Scanner sc = new Scanner(System.in);
//        调用对象sc中的nextInt方法用来接受键盘输入的整型数据
//        int num = sc.nextInt();
//        System.out.println(num);

        new object();

        //对象的比较
        String str = new String("abc");
        String str1 = new String("abc");
        //“==”运算符比较
        System.out.println(str==str1);
        //equals()方法比较
        System.out.println(str.equals(str1));
        //equals()方法是String类中的方法，它用于比较两个对象引用所指的内容是否相等
        //而“==”运算符比较的是两个对象引用的地址是否相等
        String str2 = "abc";
        String str3 = "abc";
        System.out.println(str2==str3);
        System.out.println(str2.equals(str3));

        //对象的销毁
        //每个对象都有生命周期，当对象的生命周期结束时，分配给该对象的内存地址需要被回收
        //Java拥有一套完整的垃圾回收机制，垃圾回收器会自动回收无用却占用内存的资源。
        //何种对象会被Java虚拟机视为“垃圾”?
        //对象引用超过其作用范围，这个对象将被视为垃圾
        //将对象赋值为null
        //垃圾回收器只能回收那些由new操作符创建的对象
        //某些对象不是通过new操作符在内存中获取存储空间的，这种对象无法被垃圾回收机制所识别
        //在Java中提供了一个finalize()方法，这个方法是Object类的方法，它被声明为protected，用户可以在自己的类中定义这个方法
        //如果用户在类中定义了finalize()方法，在垃圾回收时会首先调用该方法，在下一次垃圾回收动作发生时，才真正回收被对象占用的内存
        //垃圾回收或finalize()方法并不保证一定会发生。如果Java虚拟机内存损耗待尽，它将不会执行垃圾回收处理
        //Java提供了System.gc()方法来强制启动垃圾回收器
    }
}
