package com.company;

import java.util.Arrays;

public class GFG_bubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        int[] result = bubbleSort(arr,n);
        System.out.println(Arrays.toString(result));
    }
    public static int[] bubbleSort(int arr[], int n)
    {
        //code here
        for(int i = n-1;i>=1;i--){
            for(int j =0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
