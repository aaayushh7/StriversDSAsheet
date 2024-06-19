package com.company;

public class Leetcode1004 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        int result = longestOnes(arr, k);
        System.out.println(result);
    }
    public static int longestOnes(int[] arr, int k){
        int maxlen=0,l=0,r=0,len=0,zeroes=0;
        while(r<arr.length){
            if(arr[r]==0){
                zeroes++;
            }
            if(zeroes>k){
//                len=r-l+1;
                if(arr[l]==0){
                    zeroes--;
                }
                l++;
            }
            len = r-l+1;
            maxlen = Math.max(len,maxlen);
            r++;
        }
        return maxlen;
    }
}
