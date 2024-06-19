package com.company;

import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean check = isPalindrome(str);
        System.out.println(check);
    }
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        char[] charArray = str.toCharArray();
        if(charArray[0]==charArray[str.length()-1]){
            return isPalindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
}
