package com.company;

import java.util.HashSet;
import java.util.Set;

public class LongestConsSequenceGFG {
    public static void main(String[] args) {
        int[] arr = {2,6,1,9,4,5,3};
        int result = findLongest(arr);
        System.out.println(result);
    }
    static int findLongest(int[] array){
        Set<Integer> set = new HashSet<>();
        if(array.length==0){
            return 0;
        }
        int longest = 1;
        for(int i: array){
            set.add(i);
        }
        for(int it: set){
            if(!set.contains(it-1)){
               int cnt = 1;
               int x = it;
                while (set.contains(x + 1)) {
                    cnt +=1;
                    x+=1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}
