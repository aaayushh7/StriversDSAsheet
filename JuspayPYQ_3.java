package com.company;

import java.util.HashMap;
import java.util.Map;

public class JuspayPYQ_3 {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,3,3};
        System.out.println(duplicates(arr));
    }
    private static int duplicates(int[] arr){
        Map<Integer, Integer> mp = new HashMap<>();
        int count = 0;
        for(int i = 0;i<arr.length; i++){
            if(mp.containsKey(arr[i])){
                count++;
            } else {
                mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            }
        }
        return count;
    }
}
