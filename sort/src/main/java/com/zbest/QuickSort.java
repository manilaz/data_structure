package com.zbest;

import java.util.Arrays;

/**
 * Created by zhangbin on 2019/1/22.
 */
public class QuickSort {



    //单次分组
    public static int sort(int[] arr,int start,int end){

        System.out.println("start:"+start+",end:"+end);
        int count = 0;
        if(end <= start) return count;
        int i = start + 1;
        int j = end;
        int tmp ;
        do{
            System.out.println(arr[i] + "&&" + arr[j]);
            if (arr[i] > arr[j]) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            } else {
                j--;
            }
            count++;
            if(j<start || i>end) return count;

        }while (i != j);
        count ++;
        System.out.println(arr[start] + "&&&" + arr[j]+"&&&"+arr[i]);
        if(arr[start] > arr[j]){
            tmp = arr[start];
            arr[start] = arr[j];
            arr[j] = tmp;
        }

//        if(start < (end-start)/2)
//            count += sort(arr,start,(end-start)/2);
//        if((end-start)/2+1 < end)
//            count += sort(arr,(end-start)/2+1,end);

        System.out.println(array2String(arr,start,i)+"|"+array2String(arr,i+1,end));

        System.out.println(start+"|"+i+"|"+(i+1)+"|"+end);
        System.out.println("---------");
        return count;
    }


    public static int sort(int[] arr){

        return sort(arr,0,arr.length-1);
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
        sort(arr,0,4);
//        sort(arr);
    }

}
