package com.company;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3 {
    public static void main(String[] args) {
        String s = "bbbbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
    public static int lengthOfLongestSubstring(String s){
        Map<Character, Integer> hashMap = new HashMap<>();
        char[] arr = s.toCharArray();
        int r=0,l=0,len=0,maxlen=0;
        while(r < arr.length){
            if(hashMap.containsKey(arr[r])){
                if(hashMap.getOrDefault(arr[r],0)>=l){
                    l=hashMap.getOrDefault(arr[r],0)+1;
                }
            }
            len = r-l+1;
            maxlen = Math.max(len,maxlen);
            hashMap.put(arr[r],r);
            r++;
        }
        return maxlen;
    }
}

