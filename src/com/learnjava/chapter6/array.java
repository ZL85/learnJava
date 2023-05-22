package com.learnjava.chapter6;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //数组是相同类型的用一个标识符封装到一起的基本类型数据序列或对象序列
        //可以用一个统一的数组名和下标来唯一确定数组中的元素

        //一维数组
        //创建一维数组
        //数组作为对象允许使用new关键字进行内存分配
        //在使用数组之前，必须首先定义数组变量所属的类型

        //先声明，再用new运算符进行内存分配
        //声明
        //数组元素类型 数组名字[];
        //数组元素类型[] 数组名字;
        //单个“[]”表示要创建的数组是一个一维数组
        int[] arr;
        String[] str;

        //在为数组分配内存空间时必须指明数组的长度
        //数组名字 = new 数组元素的类型[数组元素的个数];
        //数组名字：被连接到数组变量的名称
        //数组元素的个数：指定数组中变量的个数，即数组的长度
        arr = new int[5];
        //数组的下标是从0开始的
        for (int x:arr) {
            System.out.printf(x+" ");
        }
        //使用new关键字为数组分配内存时，整型数组中各个元素的初始值都为0。

        System.out.println();
        //声明的同时为数组分配内存
        //数组元素的类型 数组名 = new数组元素的类型[数组元素的个数];
        String month[] = new String[12];

        //初始化一维数组
        int arr1[] = new int[]{1,2,3,4,5};
        System.out.println("the elements in arr1 are: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("the elements in arr2 are: ");
        int arr2[] = {6,7,8,9,10};
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf(arr2[i]+" ");
        }
        System.out.println();

        //使用一维数组
        //输出各月的天数
        int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < 12; i++) {
            System.out.println((i+1)+"月有"+day[i]+"天");
        }

        //二维数组
        //二维数组的创建
        //先声明，再用new运算符进行内存分配
        //数组元素的类型 数组名字[][];
        //数组元素的类型[][] 数组名字;
        int[][] arr3;
        arr3 = new int[2][2];
        int arr4[][];
        arr4 = new int[2][2];

        //声明的同时为数组分配内存
        int[][] arr5 = new int[2][4];
        int[][] arr6 = new int[2][];
        arr6[0] = new int[2];
        arr6[1] = new int[3];

        //二维数组初始化
        //type arrayname[][] = {value1,value2…valuen};
        //type：数组数据类型
        //arrayname：数组名称，一个合法的标识符
        //value：数组中各元素的值
        int[][] arr7 = {{1,2},{3,4}};
        System.out.println(arr7[1][1]);
        arr7[1][1] = 6;
        System.out.println(arr7[1][1]);

        //使用二维数组
        //输出一个3行4列且所有元素都为0的矩阵
        int[][] arr8 = new int[3][4];
        //for循环遍历数组
        for (int i = 0; i < arr8.length; i++) {
            for (int j = 0; j < arr8[i].length; j++) {
                System.out.print(arr8[i][j]+"\t");
            }
            System.out.println();
        }

        //数组的基本操作
        //java.util包的Arrays类包含了用来操作数组（如排序和搜索）的各种方法

        //遍历数组
        //foreach遍历数组
        for (int[] values:arr8) {
            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i]+"\t");
            }
            System.out.println();
        }

        //填充替换数组元素
        //通过Arrays类的静态方法fill()来对数组中的元素进行替换，通过各种重载形式可完成对任意类型的数组元素的替换
        //fill(int[] a,int value)将指定的int值分配给int型数组的每个元素
        //a：要进行元素替换的数组
        //value：要存储数组中所有元素的值
        str = new String[6];
        Arrays.fill(str,"H");
        for (int i = 0; i < str.length; i++) {
            System.out.printf(str[i]+" ");
        }

        //fill(int[] a,int fromIndex,int toIndex,int value)将指定的int值分配给int型数组指定范围中的每个元素
        //a：要进行填充的数组
        //fromIndex：要使用指定值填充的第一个元素的索引（包括）
        //toIndex：要使用指定值填充的最后一个元素的索引（不包括）
        //如果fromIndex == toIndex，则填充范围为空
        //value：要存储在数组所有元素中的值
        System.out.println();
        Arrays.fill(str,2,4,"A");
        for (int i = 0; i < str.length; i++) {
            System.out.printf(str[i]+" ");
        }

        //对数组进行排序
        //通过Arrays类的静态sort()方法可以实现对数组的排序
        //Arrays.sort(object)
        //object是指进行排序的数组名称
        System.out.println();
        int[] arr9 = {61,9,22,53,8,23,54,76,32,67,33,69};
        Arrays.sort(arr9);
        System.out.println("arr9 after sort: ");
        for (int i = 0; i < arr9.length; i++) {
            System.out.printf(arr9[i]+" ");
        }
        //Java中的String类型数组的排序算法是根据字典编排顺序排序的，因此数字排在字母前面，大写字母排在小写字母前面。

        //复制数组
        //copyOf()方法是复制数组至指定长度
        //copyOf(arr,int newlength)
        //arr：要进行复制的数组
        //newlength：int型常量，指复制后的新数组的长度
        System.out.println();
        int[] arr10 = Arrays.copyOf(arr9,6);
        for (int i = 0; i < arr10.length; i++) {
            System.out.printf(arr10[i]+" ");
        }
        System.out.println();
        int[] arr11 = Arrays.copyOf(arr9,15);
        for (int i = 0; i < arr11.length; i++) {
            System.out.printf(arr11[i]+" ");
        }
        //如果新数组的长度大于数组arr的长度，则用0填充（整型数组用0填充，char型数组则使用null来填充）

        //copyOfRange()方法则将指定数组的指定长度复制到一个新数组中
        //copyOfRange(arr,int formIndex,int toIndex)
        //arr：要进行复制的数组对象
        //formIndex：指定开始复制数组的索引位置。formIndex必须在0至整个数组的长度之间。新数组包括索引是formIndex的元素。
        //toIndex：要复制范围的最后索引位置。可大于数组arr的长度。新数组不包括索引是toIndex的元素。
        System.out.println();
        int[] arr12 = Arrays.copyOfRange(arr9,6,10);
        for (int i = 0; i < arr12.length; i++) {
            System.out.printf(arr12[i]+" ");
        }

        //数组查询
        //Arrays类的binarySearch()方法，可使用二分搜索法来搜索指定数组，以获得指定对象。该方法返回要搜索元素的索引值。
        //使用该方法之前要对数组进行排序，来获得准确的索引值
        //binarySearch(Object[],Object key)
        //a：要搜索的数组
        //key：要搜索的值
        //如果key包含在数组中，则返回搜索值的索引；否则返回-1或“-”（插入点）
        //插入点是搜索键将要插入数组的那一点，即第一个大于此键的元素索引
        System.out.println();
        int index = Arrays.binarySearch(arr9,33);
        System.out.println("arr9中值为33的元素索引是："+index);

        //binarySearch(Object[],int fromIndex,int toIndex,Object key)在指定的范围内检索某一元素
        //a：要进行检索的数组
        //fromIndex：指定范围的开始处索引（包含）
        //toIndex：指定范围的结束处索引（不包含）
        //key：要搜索的元素
        int index1 = Arrays.binarySearch(arr9,0,5,33);
        System.out.println("arr9中值为33的元素索引是："+index1);

        String[] str1 = {"b","a","c","g","z","r"};
        Arrays.sort(str1);
        int index2 = Arrays.binarySearch(str1,0,2,"r");
        System.out.println("str1中值为r的元素索引是："+index2);
    }
}
