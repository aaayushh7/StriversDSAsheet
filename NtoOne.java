package com.company;

import java.util.Arrays;

public class NtoOne {
    public static void main(String[] args) {
        int[] arr = printNos(5);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] printNos(int n){
        int [] arr = new int[n];
        return helperFunction(arr,0,n);
    }
    public static int[] helperFunction(int[] arr,int i, int n){
        if(i==n){
            return arr;
        }
        arr[i]=i+1;
        return helperFunction(arr,i+1,n);
    }
}
