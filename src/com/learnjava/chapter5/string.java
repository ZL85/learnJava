package com.learnjava.chapter5;

import java.util.Date;

public class string {
    public static void main(String[] args) {
        //String(char a[])
        //用一个字符数组a创建String对象
        char[] a = {'H','E','L','L','O'};
        String s = new String(a);
        System.out.println(s);
        //等价于String s = new String("HELLO");

        //String(char a[], int offset, int length)
        //提取字符数组a中的一部分创建一个字符串对象
        //数offset表示开始截取字符串的位置
        //length表示截取字符串的长度
        char[] a1 = {'H','E','L','L','O'};
        String s1 = new String(a1,2,3);
        System.out.println(s1);
        //等价于String s1 = new String("LLO");

        //String(char[] value)
        //分配一个新的String对象，使其表示字符数组参数中所有元素连接的结果
        char[] a2 = {'W','O','R','L','D'};
        String s2 = new String(a2);
        System.out.println(s2);
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
        //compareTo()方法为按字典顺序比较两个字符串，该比较基于字符串中各个字符的Unicode值，
        //按字典顺序将此String对象表示的字符序列与参数字符串所表示的字符序列进行比较。
        //如果按字典顺序此String对象位于参数字符串之前，则比较结果为一个负整数
        //如果按字典顺序此String对象位于参数字符串之后，则比较结果为一个正整数
        //如果这两个字符串相等，则结果为0
        //compareTo()方法只有在equals(Object)方法返回true时才返回0
        //str.compareTo(String otherstr)
        //str、otherstr是要比较的两个字符串对象
        String str9 = "a";
        String str10 = "b";
        String str11 = "c";
        System.out.println("按字典顺序比较str10和str9："+str10.compareTo(str9));
        System.out.println("按字典顺序比较str10和str11："+str10.compareTo(str11));
        //str.compareToIgnoreCase()按字典顺序比较两个字符串（忽略大小写）
        System.out.println("按字典顺序比较str7和str8（忽略大小写）"+str7.compareToIgnoreCase(str8));

        //字母大小写转换
        //使用toLowerCase()方法和toUpperCase()方法进行大小写转换时，数字或非字符不受影响
        //toLowerCase()将String转换为小写
        //str.toLowerCase()
        //str是要进行转换的字符串
        System.out.println("将str1转为小写："+str1.toLowerCase());

        //toUpperCase()将String转换为大写
        //str.toUpperCase()
        //str是要进行转换的字符串
        System.out.println("将str9转为大写："+str9.toUpperCase());

        //字符串分割
        //split()可以使字符串按指定的分割字符或字符串对内容进行分割，并将分割后的结果存放在字符串数组中
        //split(String sign)可根据给定的分割符对字符串进行拆分
        //str.split(String sign)
        //sign为分割字符串的分割符，也可以使用正则表达式
        //没有统一的对字符进行分割的符号。如果想定义多个分割符，可使用符号“|”。例如，“,|=”表示分割符分别为“,”和“=”。
        String str12 = "It's a nice day today!";
        String[] arr = str12.split(" ");
        System.out.printf("将str12按照空格进行分割得到的结果是：");
        for (String i:arr) {
            System.out.printf("["+i+"]");
        }

        System.out.println();
        //split(String sign,int limit)可根据给定的分割符对字符串进行拆分，并限定拆分的次数。
        //str.split(String sign,int limit)
        //sign：分割字符串的分割符，也可以使用正则表达式
        //limit：限制的分割次数
        String[] arr1 = str12.split(" ",3);
        System.out.printf("将str12按照空格进行三次分割得到的结果是：");
        for (String i:arr1) {
            System.out.printf("["+i+"]");
        }

        //格式化字符串
        //String类的静态format()方法用于创建格式化的字符串
        //format(String format,Object…args)使用指定的格式字符串和参数返回一个格式化字符串，新字符串使用本地默认的语言环境
        //str.format(String format,Object…args)
        //format：格式字符串
        //args：格式字符串中由格式说明符引用的参数。如果还有格式说明符以外的参数，则忽略这些额外的参数。此参数的数目是可变的，可以为0

        //format(Local l,String format,Object…args)
        //l：格式化过程中要应用的语言环境。如果l为null，则不进行本地化。
        //format：格式字符串
        //args：格式字符串中由格式说明符引用的参数。如果还有格式说明符以外的参数，则忽略这些额外的参数。此参数的数目是可变的，可以为0

        //日期和时间字符串格式化
        //日期格式化
        //%te    一个月中的某一天
        //%tb    指定语言环境的月份简称
        //%tB    指定语言环境的月份全称
        //%tA    指定语言环境的星期几全称
        //%ta    指定语言环境的星期几简称
        //%tc    包括全部日期和时间信息
        //%tY    4位年份
        //%tj    一年中的第几天（001~366）
        //%tm    月份
        //%td    一个月中的第几天（01~31）
        //%ty    2位年份

        System.out.println();
        //返回一个月中的天数
        Date date = new Date();
        String str13 = String.format("%te",date);
        System.out.println("当前日期中的天数是："+str13);
        String year = String.format("%tY",date);
        String month = String.format("%tm",date);
        String day = String.format("%td",date);
        System.out.println("现在是"+year+"年"+month+"月"+day+"号");

        //时间格式化
        //%tH    2位数字的24时制的小时（00~23）
        //%tI    2位数字的12时制的小时（00~23）
        //%tk    2位数字的24时制的小时（0~23）
        //%tl    2位数字的12时制的小时（1~12）
        //%tM    2位数字的分钟（00~59）
        //%tS    2位数字的秒数（00-60）
        //%tL    3位数字的毫秒数（000~999）
        //%tN    9位数字的微秒数（000000000~999999999）
        //%tp    指定语言环境下上午或下午标记
        //%tz    相对于GMT RFC 82格式的数字时区偏移量
        //%tZ    时区缩写形式的字符串
        //%ts    1970-01-01 00:00:00至现在经过的秒数
        //%tQ    1970-01-01 00:00:00至现在经过的毫秒数
        String hour = String.format("%tH",date);
        String minute = String.format("%tM",date);
        String second = String.format("%tS",date);
        System.out.println("现在是"+hour+"时"+minute+"分"+second+"秒");

        //格式化常见的日期时间组合
        //%tF    “年-月-日”格式（4位年份）
        //%tD    “月/日/年”格式（2位年份）
        //%tc    全部日期和时间信息
        //%tr    “时:分:秒 PM （AM）”格式（12时制）
        //%tT    “时:分:秒”格式（24时制）
        //%tR    “时:分”格式（24时制）
        String time = String.format("%tr",date);
        String form = String.format("%tF",date);
        System.out.println("全部时间信息是："+time);
        System.out.println("年-月-日格式："+form);

        //常规类型格式化
        //%b、%B    格式化为布尔类型
        //%h、%H    格式化为散列码
        //%s、%S    格式化为字符串类型
        //%c、%C    格式化为字符类型
        //%d        格式化为十进制整数
        //%o        格式化为八进制整数
        //%x、%X    格式化为十六进制整数
        //%e        格式化为用科学计数法形式表示的十进制数
        //%a        格式化为罗有效位数和指数的十六进制浮点值
        //%n        特定于平台的行分隔符
        //%%        字面值%'
        String str14 = String.format("%d",400/2);
        String str15 = String.format("%b",3>5);
        String str16 = String.format("%x",200);
        System.out.println("400/2="+str14);
        System.out.println("3>5? "+str15);
        System.out.println("200的十六进制表示是："+str16);

        //使用正则表达式
        //正则表达式通常被用于判断语句中，用来检查某一字符串是否满足某一格式
        //正则表达式是含有一些具有特殊意义字符的字符串，这些特殊字符称为正则表达式的元字符
        //元字符        正则表达式中的写法        意义
        //.             .                       代表任意一个字符
        //\d            \\d                     代表0~9的任意一个数字
        //\D            \\D                     代表任意一个非数字数字
        //\s            \\s                     代表空白字符，如'\t'、'\n'
        //\S            \\S                     代表非空白字符
        //\w            \\w                     代表可用作标识符的字符，但不包括"$"
        //\W            \\W                     代表不可用于标识符的字符
        //\p{Lower}     \\p{Lower}              代表小写字母a~z
        //\p{Upper}     \\p{Upper}              代表大写字母A~Z
        //\p{ASCII}     \\p{ASCII}              ASCII字符
        //\p{Alpha}     \\p{Alpha}              字母字符
        //\p{Digit}     \\p{Digit}              十进制数字，即0~9
        //\p{Alnum}     \\p{Alnum}              数字或字母字符
        //\p{Punct}     \\p{Punct}              标点符号
        //\p{Graph}     \\p{Graph}              可见字符
        //\p{Print}     \\p{Print}              可打印字符
        //\p{Blank}     \\p{Blank}              空格或制表符
        //\p{Cntrl}     \\p{Cntrl}              控制字符
    }
}
//Java中由双引号（" "）包围的都是字符串
//声明字符串变量必须经过初始化才能使用