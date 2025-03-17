package com.company;

import java.util.Arrays;

public class LeetCode31 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void nextPermutation(int[] arr) {
        int n = arr.length - 1;
        while (n > 0 && arr[n - 1] > arr[n]) {
            n--;
        }
        if (n == 0) {
            reverse(arr, 0, arr.length - 1);
        }
        int j = arr.length - 1;
        while (j >= 0 && arr[j] < arr[n - 1]) {
            j--;
        }
        swap(arr, n - 1, j);
        reverse(arr, n, arr.length - 1);
    }

    private static void reverse(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
