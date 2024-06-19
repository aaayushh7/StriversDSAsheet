package com.company;

import java.util.Arrays;

public class GFG_insertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        int[] result = insertionSort(arr,n);
        System.out.println(Arrays.toString(result));
    }
    static void insert(int arr[],int j)
    {
        // Your code here
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        return;

    }
    //Function to sort the array using insertion sort algorithm.
    static int[] insertionSort(int arr[], int n)
    {
        //code here
        for(int i=1;i<n;i++){
            insert(arr,i);
        }
        return arr;
    }
}
