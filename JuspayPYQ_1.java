package com.company;

import java.util.*;

public class JuspayPYQ_1 {
    public static void main(String[] args) {
        //number of stars between two bars "| |"
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String input = sc.next();
        System.out.println("Enter size of StartIndex and EndIndex");
        int n = sc.nextInt();
        int[] startIndex = new int[n];
        int[] endIndex = new int[n];
        System.out.println("StartIndex[] elements");
        for(int i=0;i<n;i++){
            startIndex[i]= sc.nextInt();
        }
        System.out.println("EndIndex[] elements");
        for(int i=0;i<n;i++){
            endIndex[i]= sc.nextInt();
        }
        System.out.println(countStars(input,startIndex,endIndex));
    }
    private static ArrayList<Integer> countStars(String str,int[] s, int[] e){
        Stack<Character> stk = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();
        char[] c = str.toCharArray();
        for(int i = 0; i<s.length;i++){
            int startIndex = s[i];
            int endIndex = e[i];
            int count = 0;
            int sum=0;
            for (int j = startIndex; j<=endIndex; j++){
                if (stk.isEmpty() && c[j]=='|'){
                    stk.add(c[j]);
                    count=0;
                }
                else if(!stk.empty() && c[j]=='|'){
                    sum+=count;
                    count=0;
                }
                else if(c[j]=='*'){
                    count++;
                }
            }
            answer.add(sum);
            stk.pop();
        }
        return answer;
    }
}
