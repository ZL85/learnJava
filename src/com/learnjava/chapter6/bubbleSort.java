package com.learnjava.chapter6;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {21,54,23,41,10,15,18,36,27};
        bubbleSort bs = new bubbleSort();
        bs.sort(arr);
    }

    public void sort(int[] arr){
        //冒泡排序思想是对比相邻的元素值，如果满足条件就交换元素值，把较小的元素移动到数组前面，把大的元素移动到数组后面
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
