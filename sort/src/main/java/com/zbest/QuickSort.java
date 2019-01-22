package com.zbest;

import java.util.Arrays;

/**
 * Created by zhangbin on 2019/1/22.
 */
public class QuickSort {



    //单次分组
    public static int sort(int[] arr,int start,int end){
        int count = 0;
        if(end <= start) return start;
        int i = start + 1;
        int length = end - start + 1;
        int j = end;
        int tmp ;
        do{
            if(arr[i] > arr[j]){
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }else {
                j--;
            }
            count++;

        }while (i != j);
        count ++;
        if(arr[start] > arr[(end-start)/2]){
            tmp = arr[start];
            arr[start] = arr[(end-start)/2];
            arr[(end-start)/2] = tmp;
        }

        System.out.println("分组对比:"+count+"次,结果"+array2String(arr,start,(end-start)/2)+"|"+array2String(arr,(end-start)/2+1,end));
        return (end-start)/2;
    }


    public static int sort(int[] arr){
        int k = arr.length;

        int x = 0;
        while ((k=k/2)>0){ //层数循环

            if(x == 0){
                int sort = sort(arr, 0, arr.length - 1);
            }
            for(int i = 0;i<(x=x*2);i++){

            }

        }
        return 0;
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

        sort(arr,0,8);
    }

}
