package com.company;

import java.util.Arrays;

public class frequencyInArray {
    public static void main(String[] args) {
        int[] arr = {10, 7, 9, 8, 14, 20, 6};
        int[] checkFrequency = frequency(arr.length,20,arr);
        System.out.println(Arrays.toString(checkFrequency));
    }
    public static int[] frequency(int n, int x,int[] nums){
        int[] hash = new int[n];
        for(int num : nums){
            if(num<=x && num<=n){
                hash[num-1]++;
            }
        }
        return hash;
    }
}
