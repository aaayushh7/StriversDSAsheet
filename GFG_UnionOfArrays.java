package com.company;

import java.util.ArrayList;

public class GFG_UnionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};
        ArrayList<Integer> result = findUnion(arr1,arr2,arr1.length, arr2.length);
        System.out.println(result);
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }
            else {
                if(list.isEmpty() || list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(j<m){
            if(list.get(list.size()-1)!=arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        while(i<n){
            if(list.get(list.size()-1)!=arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        return list;
    }
}
