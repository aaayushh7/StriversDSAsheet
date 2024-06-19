package com.company;

import java.util.HashMap;
import java.util.Map;

public class Leetcode904 {
    public static void main(String[] args) {
        int[] fruit = {3,3,3,1,2,1,1,2,3,3,4};
        int result = totalFruit(fruit);
        System.out.println(result);
    }
    public static int totalFruit(int[] array){
        int max=0,l=0,r=0;
        Map<Integer,Integer> hashMap = new HashMap<>();
        while (r < array.length) {
            hashMap.put(array[r], hashMap.getOrDefault(array[r], 0) + 1);
            if (hashMap.size() > 2) {
                if (hashMap.get(array[l])==1) {
                    hashMap.remove(array[l]);
                }
                else{
                    hashMap.put(array[l], hashMap.getOrDefault(array[l], 0) - 1);
                }
                l++;
            }
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }
}
