package com.learnjava.chapter6;

public class reverseSort {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        reverseSort rs = new reverseSort();
        rs.sort(arr);
    }

    public void sort(int[] arr){
        //反转排序思想是把数组最后一个元素与第一个元素替换，倒数第二个元素与第二个元素替换，依此类推，直到把所有数组元素反转替换。
        System.out.println("arr: ");
        showArray(arr);
        for (int i = 0; i < (arr.length/2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("sorted arr is ");
        showArray(arr);
    }

    public void showArray(int[] arr){
        for (int i:arr) {
            System.out.printf(i+" ");
        }
        System.out.println();
    }}
