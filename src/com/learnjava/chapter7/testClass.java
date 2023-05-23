package com.learnjava.chapter7;

public class testClass {
    //类是对象的载体，它定义了对象所具有的功能
    //对象：属性（静态）、行为（动态）
    //面向对象程序设计：首先要将现实世界的实体抽象为对象，然后考虑这个对象具备的属性和行为
    //类是世间事物的抽象称呼，而对象则是这个事物相对应的实体
    //类是封装对象的属性和行为的载体，反过来说，具有相同属性和行为的一类实体被称为类
    //在Java语言中，类中对象的行为是以方法的形式定义的，对象的属性是以成员变量的形式定义的，所以类包括对象的属性和方法
    //面向对象程序设计具有以下特点:
    //封装：将对象的属性和行为封装起来，其载体就是类（为用户提供对象的属性和行为的接口）
    //继承：继承性主要利用特定对象之间的共有属性（子类和父类）
    //多态：将父类对象应用于子类的特征就是多态，多态的实现依赖于抽象类和接口

    //成员变量
    //成员方法
    //类成员变量和成员方法也可以统称为类成员
    public class BOOK {
        private String name;

        public String getName() {
            int id = 0;//局部变量
            //getName()方法调用setName()方法将图书名称赋予一个值
            setName("Java");
            return id + this.name;
        }

        //Java中的成员方法无返回值，可以使用void关键字表示
        private void setName(String name) {
            this.name = name;
        }

        public BOOK getBook() {
            return this;
        }
    }

    //Java中的权限修饰符主要包括private、public和protected
    //如果一个类的成员变量或成员方法被修饰为private，则该成员变量只能在本类中被使用，在子类中是不可见的，并且对其他包的类也是不可见的。
    //如果将类的成员变量和成员方法的访问权限设置为public，那么除了可以在本类使用这些数据之外，还可以在子类和其他包的类中使用。
    //如果一个类的访问权限被设置为private，这个类将隐藏其内的所有数据，以免用户直接访问它。
    //如果需要使类中的数据被子类或其他包中的类使用，可以将这个类设置为public访问权限。
    //如果一个类使用protected修饰符，那么只有本包内的该类的子类或其他类可以访问此类中的成员变量和成员方法。
    //public和protected修饰的类可以由子类访问，如果子类和父类不在同一包中，那么只有修饰符为public的类可以被子类进行访问。
    //如果父类不允许通过继承产生的子类访问它的成员变量，那么必须使用private声明父类的这个成员变量

    //访问包的位置        private        protected        public
    //本类               可见            可见             可见
    //同包其他类或子类     不可见          可见             可见
    //其他包的类或子类     不可见         不可见            可见

    //当声明类时不使用修饰符设置类的权限，则这个类预设为包存取范围，即只有一个包中的类可以调用这个类的成员变量或成员方法。

    //Java语言规定，类的权限设定会约束类成员的权限设定

    //局部变量的有效范围从该变量的声明开始到该变量的结束为止
    //在相互不嵌套的作用域中可以同时声明两个名称和类型相同的局部变量，但是在相互嵌套的区域中不可以这样声明

    //this关键字
    //Java语言中规定使用this关键字来代表本类对象的引用，this关键字被隐式地用于引用对象的成员变量和方法
    //this除了可以调用成员变量或成员方法之外，还可以作为方法的返回值

    //Java语言中最常规的调用方式是使用“对象.成员变量”或“对象.成员方法”进行调用

    //类的构造方法
    //构造方法是一个与类同名的方法，对象的创建就是通过构造方法完成的。每当类实例化一个对象时，类都会自动调用构造方法。
    //构造方法的特点如下：
    //构造方法没有返回值，并不需要使用void关键字进行修饰
    //构造方法的名称要与本类的名称相同
    //构造方法修饰符 构造方法的名称(){
    //    方法体
    //    ...
    //}
    //在构造方法中可以为成员变量赋值，这样当实例化一个本类的对象时，相应的成员变量也将被初始化。
    //如果类中没有明确定义构造方法，编译器会自动创建一个不带参数的默认构造方法

    //this还可以调用类中的构造方法
    public class anything{
        public anything(){
                //只可以在无参构造方法中的第一句使用this调用有参构造方法
            this("this调用有参构造方法");
            System.out.println("无参构造方法");
        }

        public anything(String name){
                System.out.println("有参构造方法");
            }
    }

    //静态变量、常量和方法
    //由static修饰的变量、常量和方法被称作静态变量、常量和方法
    //静态数据与静态方法的作用通常是为了提供共享数据或方法
    //有时，在处理问题时会需要两个类在同一个内存区域共享一个数据
    //被声明为static的变量、常量和方法被称为静态成员
    //静态成员属于类所有，区别于个别对象，可以在本类或其他类使用类名和“.”运算符调用静态成员
    //类名.静态类成员
    public class staticTest {
        final static double PI = 3.1415;//静态常量
        static int id;//静态变量

        ////静态方法
        public static void method1() {
            //do sth;
        }

        public void method2() {
            System.out.println(staticTest.PI);
            System.out.println(staticTest.id);
            staticTest.method1();
        }
    //静态成员同样遵循着public、private和protected修饰符的约束
//        public static staticTest method3(){
//            method2();
//            return this;
//        }
    //在Java语言中对静态方法有两点规定：
    //在静态方法中不可以使用this关键字
    //在静态方法中不可以直接调用非静态方法
    //method3()方法为一个静态方法，而在其方法体中调用了非静态方法和this关键字，会报错
    }

    //在Java中规定不能将方法体内的局部变量声明为static的
    //如果在执行类时，希望先执行类的初始化动作，可以使用static定义一个静态区域
    //public class example { static { // some } }
    //当这段代码被执行时，首先执行static块中的程序，并且只会执行一次

    //类的主方法
    //主方法是类的入口点，它定义了程序从何处开始；主方法提供对程序流向的控制，Java编译器通过主方法来执行程序。
//    public static void main(String[] args) {
//        方法体;
//    }
    //在主方法具有以下特性：
    //主方法是静态的，所以如要直接在主方法中调用其他方法，则该方法必须也是静态的
    //主方法没有返回值
    //主方法的形参为数组。其中args[0]~args[n]分别代表程序的第一个参数到第n个参数，可以使用args.length获取参数的个数。
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    //在Run Configurations对话框中选择Arguments选项卡，在Program arguments文本框中输入相应的参数，每个参数间按Enter键隔开。
}
