package com.company;

import java.util.Arrays;

public class LeetCode2149 {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] result = rearrangeArray(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] rearrangeArray(int[] nums) {
        int pos=0,neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0 && i%2==0){
                swap(nums,neg,i);
                neg+=2;
                pos+=2;
            }
            else if(nums[i]>0 && i%2!=0){
                swap(nums,pos,i);
                neg+=2;
                pos+=2;
            }
            else{
                neg+=2;
                pos+=2;
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int index, int i){
        if(index>=nums.length){
            return;
        }
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }
}
