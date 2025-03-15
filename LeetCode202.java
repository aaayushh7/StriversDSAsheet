package com.company;

import java.util.Scanner;

public class LeetCode202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean result = isHappy(n);
        System.out.println(result);
    }
    static boolean isHappy(int n){
        if(n<10){
            return false;
        }
        while(n>9){
            int sum = 0;
            while(n!=0){
                int digit = n%10;
                sum+=digit*digit;
                n/=10;
            }
            n=sum;
        }
        return n == 1;

    }
}
