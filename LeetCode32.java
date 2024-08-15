package com.company;

import java.util.Arrays;

public class LeetCode32 {
    public static void main(String[] args) {
        int[] arr= {1,3,2};
        nextPer(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void nextPer(int[] nums){
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){

        }
        if(index!=-1){
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[index]){
                    int temp = nums[i];
                    nums[i] =nums[index];
                    nums[index]=temp;
                    break;
                }
            }
        }

        Arrays.sort(nums,index+1,nums.length);
    }
}
