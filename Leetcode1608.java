package com.company;

import java.util.Arrays;

public class Leetcode1608 {
    public static void main(String[] args) {
        int[] arr = {0,0,3,4,4};
        int result = specialArray(arr);
        System.out.println(result);
    }
    public static int specialArray(int[] arr){
        Arrays.sort(arr);
        int size = arr.length;
        if(arr[0]>=size) return size;
        for(int i=1;i<=size;i++){
            if(arr[size-i]>=i && (size-i-1<0 || arr[size-i-1]<i)){
                return i;
            }
        }
        return -1;

    }
}
