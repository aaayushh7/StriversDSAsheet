package com.company;

import java.util.Arrays;

public class LeetCode2149 {
    public static void main(String[] args) {
        int[] arr = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        int[] result = rearrangeArray(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] rearrangeArray(int[] nums) {
        int pos=0,neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0 && i%2==0 && neg<nums.length && pos<nums.length){
                swap(nums,neg,i);
                if(nums[pos]>0 && pos==i){
                    pos+=2;
                }
                neg+=2;
            }
            else if(nums[i]>0 && i%2!=0 && pos<nums.length && neg<nums.length){
                swap(nums,pos,i);
                if(nums[neg]<0 && neg==1){
                    neg+=2;
                }
                pos+=2;
            }
            else if(nums[i]<0 && i%2==1 && pos<nums.length){
                neg+=2;
                if(nums[pos]>0){
                    pos+=2;
                }
            }
            else if(nums[i]>0 && i%2==0 && neg<nums.length){
                pos+=2;
                if(nums[neg]>0){
                    neg+=2;
                }
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
