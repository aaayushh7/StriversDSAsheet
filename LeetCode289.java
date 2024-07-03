package com.company;

import java.util.Arrays;

public class LeetCode289 {
    public static void main(String[] args) {
        int[] arr = {4,2,4,0,0,3,0,5,1,0};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZero(int[] array){
        int j = -1;
        for(int i=0;i< array.length;i++){
            if(array[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i< array.length;i++){
            if(array[i]!=0){
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                j++;
            }
        }
    }
}
