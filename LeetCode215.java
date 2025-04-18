package com.company;

import java.util.PriorityQueue;

public class LeetCode215 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(arr, k));
    }
    private static int findKthLargest(int[] arr, int k){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int num: arr){
            pq.add(num);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
}
