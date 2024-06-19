package com.company;

import java.util.Scanner;

public class numericPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        boolean m = checkPalindrome(i);
        System.out.println(m);
    }
    public static boolean checkPalindrome(int i){
        int temp = i;
        int palindrome = 0;
        while(i!=0){
            int remainder = i%10;
            palindrome = (palindrome*10)+remainder;
            i/=10;
        }
        return temp == palindrome;
    }
}
