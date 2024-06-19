package com.company;

import java.util.Arrays;

public class oneToN {
    public static void main(String[] args) {
        int[] arr = printNos(10);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] printNos(int n){
        if (n==0){
            return new int[0];
        }
        int[] smallerArray = printNos(n-1);
        int[] newArray = new int[smallerArray.length+1];
        System.arraycopy(smallerArray,0,newArray,0,smallerArray.length);
        newArray[smallerArray.length]=n;
        return newArray;
    }
}
