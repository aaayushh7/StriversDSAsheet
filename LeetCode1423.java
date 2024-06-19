package com.company;

public class LeetCode1423 {
    public static void main(String[] args) {
        int[] arr = {9,7,7,9,7,7,9};
        int k = 7;
        int result = maxScore(arr, k);
        System.out.println(result);
    }
    public static int maxScore(int[] arr, int k){
        int lsum = 0,rsum=0,maxscore=0;
        for(int i=0;i<k;i++){
            lsum = lsum + arr[i];
            maxscore = lsum;
        }
        int rindex = arr.length-1;
        for(int i = k-1; i>=0; i--){
            lsum = lsum - arr[i];
            rsum = rsum + arr[rindex];
            maxscore = Math.max(maxscore, lsum+rsum);
            rindex--;
        }
        return maxscore;
    }
}
