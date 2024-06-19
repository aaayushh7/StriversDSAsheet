package com.company;

public class CN_number {
    public static void main(String[] args) {
        int n = 35;
        int count = 0;
        while (n != 0){
            int div = n % 10;
            if(35%div==0){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }

}
