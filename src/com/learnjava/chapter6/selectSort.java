package com.learnjava.chapter6;

public class selectSort {
    public static void main(String[] args) {
        int[] arr = {21,54,23,41,10,15,18,36,27};
        selectSort ss = new selectSort();
        ss.sort(arr);
    }

    public void sort(int[] arr){
        //直接选择排序思想是将指定排序位置与其他数组元素分别对比，如果满足条件就交换元素值。
        int index;
        for (int i = 1; i < arr.length; i++) {
            index = 0;
            for (int j = 1; j <= arr.length - i; j++) {
                if (arr[j]>arr[index]){
                    index = j;
                }
            }
            int temp = arr[arr.length - i];
            arr[arr.length - i] = arr[index];
            arr[index] = temp;
        }
        showArray(arr);
    }

    public void showArray(int[] arr){
        System.out.println("sorted arr is ");
        for (int i:arr) {
            System.out.printf(i+" ");
        }
        System.out.println();
    }
}
