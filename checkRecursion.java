package com.company;

public class checkRecursion {
    public static void main(String[] args) {
       int m = printnew(5);
        System.out.println(m);
    }
    public static int printnew(int n){
        if(n<10){
            n++;
            printnew(n);
            System.out.println(n);
        }
        return 0;
    }
}
