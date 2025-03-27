package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LeetCode139 {
    public static void main(String[] args) {
        List<String> dictionary = new LinkedList<>();
        dictionary.add("i");
        dictionary.add("like");
        dictionary.add("leet");
        dictionary.add("cod");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean check = wordBreak(s, dictionary);
        System.out.println(check);
    }
    private static boolean wordBreak(String s, List<String> dictionary){
        boolean result = helperFunction(0,1, s, dictionary);;
        return result;
    }
    private static boolean helperFunction(int i, int j, String s, List<String> wordDict){
        if (j > s.length()) {
            return false;
        }
        if(j==s.length()){
            return wordDict.contains(s.substring(i,j));

        }
        if(wordDict.contains(s.substring(i,j))){
            return helperFunction(j, j, s, wordDict) ||
                    helperFunction(i, j + 1, s, wordDict);
        }
        return helperFunction(i,j+1,s,wordDict);
    }
}
