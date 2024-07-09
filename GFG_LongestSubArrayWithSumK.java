package com.company;

import java.util.HashMap;
import java.util.Map;

public class GFG_LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int result = longestSubArray(arr, arr.length,15);
        System.out.println(result);
    }
    static int longestSubArray(int[] array, int size, int sum){
        int current = 0;
        int j = 0;
        int start = 0, end=-1;
        int maxLen = 0;
        Map<Integer,Integer> mapSum = new HashMap<>();
        while(j<size){
            current += array[j];
            if(current - sum == 0){
                end = j;
                maxLen= Math.max(maxLen,end-start+1);
            }
            if(mapSum.containsKey(current-sum)){
                start = mapSum.get(current-sum)+1;
                end = j;
                maxLen= Math.max(maxLen,end-start+1);
            }
            if (!mapSum.containsKey(current)) {
                mapSum.put(current, j);
                j++;
            }
        }
        return maxLen;
    }
}
