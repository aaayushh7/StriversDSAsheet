package com.company;

import java.util.Arrays;

public class LeetCode75 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int[] result = sortColors(arr, arr.length);
        System.out.println(Arrays.toString(result));
    }
    static int[] sortColors(int[] arr, int n){
        int low = 0, mid=0,high=n-1;
        int temp=0;
        while(mid<high){
            if(arr[mid]==0){
                temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;

            }
        }
        return arr;


    }
}
