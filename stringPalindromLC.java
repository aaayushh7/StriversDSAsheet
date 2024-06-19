package com.company;

public class stringPalindromLC {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(str);
        System.out.println(result);
    }
    public static boolean isPalindrome(String str){
        String lower = str.toLowerCase();
        String cleanedString = lower.replaceAll("[^a-zA-Z0-9]","");
        return checkPalindrome(cleanedString);
    }
    public static boolean checkPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return checkPalindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
}
