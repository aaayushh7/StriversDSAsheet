package com.company;

import java.util.LinkedList;
import java.util.List;

public class LeetCode118 {
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> pascal;
        pascal = pascalList(n);
        System.out.println(pascal);
    }
    static List<List<Integer>> pascalList(int n){
        List<List<Integer>> ans = new LinkedList<>();
        for(int row = 1;row<=n;row++){
            ans.add(generateRow(row));
        }
        return ans;
    }
    static List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> Row = new LinkedList<>();
        Row.add(1);
        for(int col=1;col<row;col++){
            ans = ans * (row-col);
            ans = ans/col;
            Row.add((int)ans);
        }
        return Row;
    }
}
