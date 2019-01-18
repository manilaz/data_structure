package com.zbest;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort {

    public static int sort(int[] arr){
        int temp = 0;
        int count = 0;

        for(int i = 0;i<arr.length;i++){

        }
        return count;
    }

    public static String array2String(int[] arr){
        StringBuilder builder = new StringBuilder("[");
        Arrays.stream(arr).forEach(p->{
            builder.append(p).append(",");
        });
        return builder.append("]").toString().replace(",]","]");
    }

    public static void print(int[] arr){
        System.out.println("arr比较次数"+sort(arr)+",排序结果:"+array2String(arr));
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};//最好
        int[] arr2 = {6,5,4,3,2,1};//最坏
        int[] arr3 = {6,10,14,3,9};//栗子
        print(arr1);
        print(arr2);
        print(arr3);
    }
}
