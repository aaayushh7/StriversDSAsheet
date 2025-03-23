package com.company;

public class StiklerThiefGFG {
    public static void main(String[] args) {
        int[] arr = {6, 5, 5, 7, 4};
        System.out.println(findMax(arr));
    }
    private static int findMax(int[] arr) {
        int second = 0;
        int first = arr[0];
        for(int i=1;i<arr.length;i++){
            int current = Math.max(first, second+arr[i]);
            second = first;
            first = current;
        }
        return first;
    }
}
