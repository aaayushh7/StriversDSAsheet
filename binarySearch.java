package com.company;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,12,14,16,18,19};
        int target  =15;
        int check = Binarysearch(15,arr);
        System.out.println(check);
    }

    static int Binarysearch(int target, int[] arr){
        int start,end,mid;
        start = 0;
        end = arr.length;
        while(start<=end){
            mid = (start + end)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else if(arr[mid]==target){
                return arr[mid];
            }
        }
        return arr[end];

    }
}
