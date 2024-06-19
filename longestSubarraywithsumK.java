package com.company;

import java.util.Scanner;

public class longestSubarraywithsumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int arrayElement;
        System.out.println("enter array elements : ");

        for(int i=0;i<n;i++){
            arrayElement=sc.nextInt();
            arr[i]=arrayElement;
        }
        System.out.println("enter the value of K : ");
        int j=sc.nextInt();
        int numberOfLongestSubarrays = calculateSubarray(arr,j);
        System.out.println("number of Subarays occured : " + numberOfLongestSubarrays);
    }
    public static int calculateSubarray(int[] arr, int k){
        int Answer = 0;
        for(int i =0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    Answer++;
                    sum=0;
                    break;
                }
                if(sum>k){
                    break;
                }
            }
        }
        return Answer;
    }
}
