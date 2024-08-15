package com.company;

public class LeetCode121 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int result = maxProfit(arr);
        System.out.println(result);
    }
    static int maxProfit(int[] arr){
        int profit = 0;
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            profit=Math.max(profit,arr[i]-min);
            min = Math.min(min,arr[i]);
        }
        return profit;
    }
}
