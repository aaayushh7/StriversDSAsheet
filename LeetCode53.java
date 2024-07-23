package com.company;

public class LeetCode53 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = maxSum(arr);
        System.out.println(sum);
    }
    static int maxSum(int[] arr ){
        int sum = 0;
        int max = arr[0];
        for(int num: arr){
            sum+=num;
            max = Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
