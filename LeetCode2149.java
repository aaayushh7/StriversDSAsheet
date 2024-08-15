package com.company;

import java.util.Arrays;

public class LeetCode2149 {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] result = rearrangeArray(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] rearrangeArray(int[] arr){
        int pos = 0;
        int neg = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0 && neg<arr.length){
                int temp = arr[i];
                arr[i] =arr[neg];
                arr[neg]=temp;
                neg+=2;
            }
            if(arr[i]>0 && pos<arr.length){
                rearrangeArray(arr);
                int temp = arr[i];
                arr[i] =arr[pos];
                arr[pos]=temp;
                pos+=2;
            }
        }
        return arr;
    }
}
