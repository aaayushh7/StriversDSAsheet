package com.company;

public class GFG_MaxSumSubArr {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 6};
        int result = pairWithMaxSum(arr);
        System.out.println(result);
    }
    static int pairWithMaxSum(int[] arr){
        int maxSum = 0;
        for(int i=0;i<arr.length-1;i++){
            maxSum = Math.max(maxSum,arr[i]+arr[i+1]);
        }
        return maxSum;


    }
}
