package com.company;

public class stringPalindrome1ms {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(str);
        System.out.println(result);
    }
    public static boolean isPalindrome(String str){
        int start =0, end=str.length()-1;
        while(start<=end){
            char startPointer = str.charAt(start);
            char endPointer = str.charAt(end);
            if(!Character.isLetterOrDigit(startPointer)){
                start++;
            } else if (!Character.isLetterOrDigit(endPointer)) {
                end--;
            }
            else{
                if(Character.toLowerCase(startPointer)!=Character.toLowerCase(endPointer)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
        }
}


