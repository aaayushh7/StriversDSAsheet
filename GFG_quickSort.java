package com.company;

import java.util.Arrays;

public class GFG_quickSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        int[] result = quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(result));
    }
    static int[] quickSort(int[] arr, int low, int high){
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
        return arr;
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }
}
