package com.zbest;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    //单次分组
    public static int sort(int[] arr,int start,int end){

        int count = 0;
        if(end <= start) return count;
        int i = start + 1;
        int j = end;
        int tmp ;
        do{
            if (arr[start] > arr[j]) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }else {
                j--;
            }
            count++;
            if(j<start || i>end) return count;
        }while (i != j);
        count ++;
        if(arr[start] > arr[j]){
            tmp = arr[start];
            arr[start] = arr[j];
            arr[j] = tmp;
        }
        if(start < j)
            count += sort(arr,start,j);
        if(j < end)
            count += sort(arr,j+1,end);
        return count;
    }

    public static int sort(int[] arr){
        return sort(arr,0,arr.length-1);
    }

    public static void print(int[] arr){
        System.out.println("arr比较次数"+sort(arr)+",排序结果:"+array2String(arr));
    }

    public static String array2String(int[] arr,int start,int end){
        StringBuilder builder = new StringBuilder("[");
        for (int i = start ;i<= end ;i ++){
            builder.append(arr[i]).append(",");
        }
        return builder.append("]").toString().replace(",]","]");
    }

    public static String array2String(int[] arr){
        StringBuilder builder = new StringBuilder("[");
        Arrays.stream(arr).forEach(p->{
            builder.append(p).append(",");
        });
        return builder.append("]").toString().replace(",]","]");
    }
    public static void main(String[] args) {
        int[] arr = {18,6,47,13,7,32,22,19,5};
        print(arr);
    }

}
