package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = twoSumMap(arr, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] twoSum(int[] arr, int target){
        //two pointer approach{for sorted array}
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        while(left<right){
            while(arr[left]+arr[right]>target){
                right--;
            }
            while(arr[left]+arr[right]<target){
                left++;
            }
            if(arr[left]+arr[right]==target){
                return new int[] {left, right};
            }
        }
        return new int[]{};

    }
    static int[] twoSumMap(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length;i++){
            int rem = target-arr[i];
            if(!map.containsKey(rem)){
                map.put(arr[i],i);
            }
            if(map.containsKey(rem) && map.get(rem)!=i) {
                return new int[]{map.get(rem),i};
            }
        }
        return new int[]{};
    }
}
