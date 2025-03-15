package com.company;

import java.util.Scanner;

public class LeetCode1328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = breakPalindrome(str);
        System.out.println(result);
    }
    static String breakPalindrome(String str){
        char[] ans = str.toCharArray();
        int n = ans.length;
        if(n==1){
            return "";
        }
        for(int i=0; i<n/2;i++){
            if(ans[i]!='a'){
                ans[i]='a';
                return new String(ans);
            }
        }
        ans[n-1]='b';
        return new String(ans);
    }
}
