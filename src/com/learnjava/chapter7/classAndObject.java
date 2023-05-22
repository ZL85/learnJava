package com.learnjava.chapter7;

public class classAndObject {
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
    public class BOOK{
        private String name;

        public String getName(){
            int id = 0;
            setName("Java");
            return id+this.name;
        }

        private void setName(String name){
            this.name = name;
        }

        public BOOK getBook(){
            return this;
        }

        //Java中的权限修饰符主要包括private、public和protected
    }
}
