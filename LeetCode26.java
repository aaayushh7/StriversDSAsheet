package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode26 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] removeDuplicates(int[] arr){
        Map<Integer,Boolean> hashMap = new HashMap<>();

        int[] array = new int[arr.length];
        Arrays.fill(array,-1);
        int index = 0;
        for(int num:arr){
            if(!hashMap.containsKey(num)){
                array[index]=num;
                index++;
                hashMap.put(num,true);
            }
        }
//        for(int i = 0; i<arr.length;i++){
//            hashMap.put(arr[i], hashMap.getOrDefault(arr[i],0)+1);
//            if(hashMap.get(arr[i])==1){
//                array[index] = arr[i];
//                index++;
//            }
//        }
        return array;
    }
}
