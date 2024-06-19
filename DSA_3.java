package com.company;

public class DSA_3 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,11,23,34,46,54,68,75,78,87,98,103};
        int target = 23;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        //for ascending order
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>target){
                start = 0;
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;


    }
}
