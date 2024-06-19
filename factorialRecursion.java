package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class factorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> list = factorialNumber(n);
        System.out.println(list);
    }
    public static List<Long> factorialNumber(long n){
        List<Long> list = new LinkedList<>();
        return helperFunction(1,2,n,list);
    }
    public static List<Long> helperFunction(long fact, long i, long n, List<Long> list){
        if(fact<=n){
            list.add(fact);
            return helperFunction(fact*i,i+1,n, list);
        }
        return list;
    }
}
