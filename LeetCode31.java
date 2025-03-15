package com.company;

import java.util.Arrays;

public class LeetCode31 {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void nextPermutation(int[] arr){
        int check=0;
//        gotta update this part to handle edge cases of {132}->{231} instead of current op:{312}
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                check=i;
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1]=temp;
                break;
            }
        }
        if(check!=0){
            for(int i = check;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        if(check==0){
            for (int i = 0; i < arr.length / 2; i++) {
                int t = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = t;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
