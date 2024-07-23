package com.company;

import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
    public static void main(String[] args) {
        int[] arr = {6,5,5};
        int result = majorityElement(arr);
        System.out.println(result);
    }
    static int majorityElement(int[] arr){
        Map<Integer,Integer> hashMap = new HashMap<>();
        int max =0;
        int maxElement = -1;
        for(int num: arr){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
            if(max < hashMap.get(num)){
                max = hashMap.getOrDefault(num,0);
                maxElement = num;
            }
        }
        return maxElement;
    }
}
