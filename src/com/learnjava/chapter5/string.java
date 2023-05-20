package com.learnjava.chapter5;

public class string {
    public static void main(String[] args) {
        //String(char a[])
        //用一个字符数组a创建String对象
        char a[] = {'H','E','L','L','O'};
        String s = new String(a);
        //等价于String s = new String("HELLO");

        //String(char a[], int offset, int length)
        //提取字符数组a中的一部分创建一个字符串对象
        //数offset表示开始截取字符串的位置
        //length表示截取字符串的长度
        char a1[] = {'H','E','L','L','O'};
        String s1 = new String(a1,2,3);
        //等价于String s1 = new String("LLO");

        //String(char[] value)
        //分配一个新的String对象，使其表示字符数组参数中所有元素连接的结果
        char a2[] = {'H','E','L','L','O'};
        String s2 = new String(a2);
        //等价于String s2 = new String("HELLO");

        //引用字符串常量来创建字符串变量
        String str1,str2;
        str1 = "HELLO";
        str2 = "WORLD";
        System.out.println(str1);
        System.out.println(str2);

        //“+”运算符连接多个字符串并产生一个String对象
        System.out.println(str1+str2);

        //字符串同其他基本数据类型进行连接会将这些数据直接转换成字符串
        int read = 2;
        float practice = 2.5F;
        //将字符串与整型、浮点型变量相连
        //read和practice与字符串相连时会自动调用toString()方法，换成字符串形式参与连接
        System.out.println("I spend "+read+" hours reading books and "+practice+" hours praticing oral English a day.");

        //获取字符串长度
        //str.length();
        System.out.println("str1的长度是"+str1.length());

        //字符串查找
        //indexOf(String s)用于返回参数字符串s在指定字符串中首次出现的索引位置
        //str.indexOf(substr)
        //str：任意字符串对象
        //substr：要搜索的字符串
        String str3 = "HELLO WORLD";
        int pos = str3.indexOf(str1);
        System.out.println("str1在str3中的位置索引是"+pos);

        //lastIndexOf(String str)用于返回指定字符串最后一次出现的索引位置
        //str. lastIndexOf(substr)
        //str：任意字符串对象
        //substr：要搜索的字符串
        //如果lastIndexOf()方法中的参数是空字符串""，则返回的结果与调用该字符串length()方法的返回结果相同
        int len = str3.lastIndexOf("");
        System.out.println("空字符串在str3中的位置索引是"+len);
        System.out.println("str3的长度是"+str3.length());

        //获取指定索引位置的字符
        //str.charAt(int index)
        //str：任意字符串
        //index：整型值，用于指定要返回字符的下标
        System.out.println("str3中第5个字符是"+str3.charAt(4));

        //获取子字符串
        //substring(int beginIndex)返回的是从指定的索引位置开始截取直到该字符串结尾的子串
        //str.substring(int beginIndex)
        //beginIndex指定从某一索引处开始截取字符串
        System.out.println("从第4个字符开始截取str3得到的子串是"+ str3.substring(3));

        //substring(int beginIndex, int endIndex)返回的是从字符串某一索引位置开始截取至某一索引位置结束的子串
        //str.substring(int beginIndex, int endIndex)
        //beginIndex：开始截取子字符串的索引位置
        //endIndex：子字符串在整个字符串中的结束位置
        System.out.println("截取str3第4个字符到第8个字符得到的子串是"+ str3.substring(3,8));

        //去除空格
        //trim()方法返回字符串的副本，忽略前导空格和尾部空格
        //str.trim()
        //str为任意字符串对象
        String str4 = "  hh  ";
        System.out.println("str4: "+str4);
        System.out.println("去除前后空格的str4得到的字符串副本为："+str4.trim());

        //字符串替换
        //replace()方法可实现将指定的字符或字符串替换成新的字符或字符串
        //str.replace(char oldChar,char newChar)
        //oldChar：要替换的字符或字符串
        //newChar：用于替换原来字符串的内容
        System.out.println("str4中的h替换为H后得到的字符串为："+str4.replace('h','H'));

        //判断字符串的开始与结尾
        //startsWith()用于判断当前字符串对象的前缀是否为参数指定的字符串
        //str.startsWith(String prefix)
        //prefix是指作为前缀的字符
        System.out.println("str3是以HELLO开始的吗？"+str3.startsWith("HELLO"));

        //endsWith()用于判断当前字符串是否为以给定的子字符串结束
        //str.endsWith(String suffix)
        //suffix是指作为后缀的字符串
        System.out.println("str3是以WORLD结束的吗？"+str3.endsWith("WORLD"));

        //判断字符串是否相等
        //对字符串对象进行比较不能简单地使用比较运算符“==”，因为比较运算符比较的是两个字符串的地址是否相同
        //即使两个字符串的内容相同，两个对象的内存地址也是不同的，使用比较运算符仍然会返回false
        String str5 = new String("yep");
        String str6 = new String("yep");
        System.out.println("str5和str6相等吗？"+(str5==str6));

        //equals()
        //如果两个字符串具有相同的字符和长度，则使用equals()方法进行比较时，返回true
        //使用equals()方法对字符串进行比较时是区分大小写的，
        //str.equals(String otherstr)
        //str、otherstr是要比较的两个字符串对象
        String str7 = new String("Nope");
        String str8 = new String("nope");
        System.out.println("str7和str8相等吗？"+str7.equals(str8));
        //equalsIgnoreCase()
        //而使用equalsIgnoreCase()方法是在忽略了大小写的情况下比较两个字符串是否相等，返回结果仍为boolean类型
        //str.equalsIgnoreCase(String otherstr)
        //str、otherstr是要比较的两个字符串对象
        System.out.println("str7和str8相等吗（忽略大小写）？"+str7.equalsIgnoreCase(str8));

        //按字典顺序比较两个字符串
    }
}
//Java中由双引号（" "）包围的都是字符串
//声明字符串变量必须经过初始化才能使用