package com.company;

public class GFG_SelectionSort {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        solution.selectionSort(arr, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static class Solution
    {
        int  select(int arr[], int i)
        {
            // code here such that selectionSort() sorts arr[]
            int least = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[least]){
                    least = j;
                }
            }
            return least;
        }

        void selectionSort(int arr[], int n)
        {
            //code here
            for(int i =0; i<n-1;i++){
                int least = select(arr,i);
                int temp = arr[least];
                arr[least] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

