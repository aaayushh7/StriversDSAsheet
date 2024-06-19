package com.company;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] reversed = reverseArrayfunction(5,array);
        System.out.println(Arrays.toString(reversed));

    }
    public static int[] reverseArrayfunction(int n,int[] nums){
        int left = 0;
        int right = n-1;
        while (left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]= temp;
            left++;
            right--;
        }
        return nums;
    }
}
