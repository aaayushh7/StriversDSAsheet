package com.company;

import java.util.HashMap;
import java.util.Map;

public class LeetCode560 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int[] arr2 = {1,1,1};
        int k = 3;
        int maxSubarray = subArraySum(arr2,k);
        System.out.println(maxSubarray);
    }
    static int subArraySum(int[] arr,int k){
        Map<Integer, Integer> map = new HashMap<>();
        int preSum = 0;
        int count =0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            preSum += arr[i];
            int remove = preSum-k;
            count+=map.getOrDefault(remove,0);
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}
