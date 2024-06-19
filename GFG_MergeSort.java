package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class GFG_MergeSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        int[] result = mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(result));
    }
    static int[] mergeSort(int[] arr, int l, int h){
        int mid = (l+h)/2;
        if(l==h){
            return arr;
        }
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,h);
        merge(arr,l,mid,h);
        return arr;
    }
    static void merge(int[] arr, int l, int mid, int h){
        int left = l;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=h){
            if(arr[left]>=arr[right]){
                temp.add(arr[right]);
                right++;
            }
            else{
                temp.add(arr[left]);
                left++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=h){
            temp.add(arr[right]);
            right++;
        }
        for(int i = l;i<=h;i++){
            arr[i] = temp.get(i-l);
        }
    }
}
