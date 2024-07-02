package com.company;

public class LeetCode1752 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        boolean result = isSortedAndRotated(arr);
        System.out.println(result);
    }
    static boolean isSortedAndRotated(int[] arr){
        int count = 0;
        int rotation_index = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                count++;
                rotation_index = (i+1)%arr.length;
            }
            if(count>1){
                return false;
            }
        }
        System.out.println(rotation_index);
        return true;
    }
}
