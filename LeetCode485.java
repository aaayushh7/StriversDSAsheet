package com.company;

public class LeetCode485 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0};
        int result = findMaxConsecutiveOnes(arr);
        System.out.println(result);
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int i = 0,j=0;
        int maxLen = 0;
        int len = 0;
        while(j<nums.length){

            if (nums[j]==0 && j<nums.length) {
                j++;
                i = j;
            }
            len = j-i+1;
            maxLen = Math.max(maxLen, len);
            j++;
        }
        return maxLen;
    }
}
