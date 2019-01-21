package com.zbest;

import java.util.Arrays;

/**
 * Created by zhangbin on 2019/1/21.
 */
public class ShellsSort {

    public static int sort(int[] arr){
        int count = 0;
        int k = getK(arr.length);
        do {
            count += sort(arr, k);
            System.out.println("k="+k+"时排序结果:"+array2String(arr));
        }while ((k = getK(k)) >= 1);

        return count;
    }

    // 按步长插入排序
    public static int sort(int[] arr,int n){
        int count = 0;

        for(int i = n;i<arr.length  ;i++){
            int temp = arr[i];
            int t_index = i;
            for(int j = 0;j < i/n ;j++){
                count ++;
                if(temp < arr[i-n*(j+1)] ) {
                    arr[t_index] = arr[i-n*(j+1)];
                    arr[i-n*(j+1)] = temp;
                    t_index = i-n*(j+1);
                }else {
                    break;
                }
            }
        }
        return count;
    }

    public static int getK(int n){
        //希尔增量
        return n/2;
    }

    public static String array2String(int[] arr){
        StringBuilder builder = new StringBuilder("[");
        Arrays.stream(arr).forEach(p->{
            builder.append(p).append(",");
        });
        return builder.append("]").toString().replace(",]","]");
    }

    public static void print(int[] arr){
        int count = sort(arr);
        System.out.println("arr比较次数"+count+",排序结果:"+array2String(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 8,9,6,3,11,2,1,17,7};
        print(arr);
    }
}
