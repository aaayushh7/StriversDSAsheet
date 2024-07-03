package com.company;

import java.util.Arrays;

public class LeetCode189 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotatedArray(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    static void rotatedArray(int[] arr, int steps){
    steps = steps%arr.length;
    rightRotate(arr,0,arr.length-1);
    rightRotate(arr,0,steps-1);
    rightRotate(arr,steps,arr.length-1);
    }
    static void rightRotate(int[] arr, int left, int right){
        if (left == right) {
            return;
        }
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
