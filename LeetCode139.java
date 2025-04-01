package com.company;

import java.util.*;

public class LeetCode139 {
    public static void main(String[] args) {
        List<String> dictionary = new LinkedList<>();
        //boiler
        dictionary.add("i");
        dictionary.add("like");
        dictionary.add("leet");
        dictionary.add("code");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean check = wordBreak(s, dictionary);
        System.out.println(check);
    }
    private static boolean wordBreak(String s, List<String> dict){
        Set<String> set = new HashSet<>(dict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0]=true;
        for(int i = 1; i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                }
            }
        }
        return dp[s.length()];
    }
}
