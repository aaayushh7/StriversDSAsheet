package com.company;

public class LeetCode485 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0};
        int result = findMaxConsecutiveOnes(arr);
        System.out.println(result);
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int left=0,right=0,len=0,maxLen=0;

        while(right<nums.length){
            if(nums[right]==0){
                right++;
                left=right;
            }
            else{
                len=right-left+1;
                maxLen=Math.max(maxLen,len);
                right++;
            }
        }

        return maxLen;
    }
}
