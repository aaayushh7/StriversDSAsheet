package com.company;

public class LeetCode268 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int result = missingNumber(arr);
        System.out.println(result);
    }
    static int missingNumber(int[] array ){
        //using hashMaps
//        Map<Integer,Boolean> hashMap = new HashMap<>();
//        for(int num: array){
//            hashMap.put(num,true);
//        }
//        for(int i =0; i<=array.length;i++){
//            if(!hashMap.containsKey(i)){
//                return i;
//            }
//        }
//        return -1;
        //using formula
        int n = array.length;
        int sum = n*(n+1)/2;
        int arraySum = 0;
        for (int num: array){
            arraySum += num;
        }
        return sum - arraySum;
    }
}
