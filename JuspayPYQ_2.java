package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JuspayPYQ_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(vampireBlood(n));
    }
    private static ArrayList<Character> vampireBlood(String n){
        int totalSum = 0;
        char[] ch = n.toCharArray();
        for(char c: ch){
            totalSum+=Integer.parseInt(String.valueOf(c));
        }
        ArrayList<Character> subArray = new ArrayList<>();
        Arrays.sort(ch);
        int subArraySum=0;
        for(int i = ch.length-1;i>=0;i--){
            if(ch[i]>totalSum/2){
                subArray.add(ch[i]);
                return subArray;
            }
            else {
                subArraySum+=Integer.parseInt(String.valueOf(ch[i]));
                subArray.add(ch[i]);
                if(subArraySum>totalSum/2){
                    return subArray;
                }
            }

        }
        return subArray;
    }
}
