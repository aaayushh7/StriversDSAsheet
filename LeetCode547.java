package com.company;

import java.util.Scanner;

public class LeetCode547 {

    static void dfs(int[][] isConnected,int i, boolean[] flag){
        if(flag[i]){
            return;
        }
        flag[i]=true;
        for(int j = 0; j<isConnected.length;j++){
            if(isConnected[i][j]==1){
                dfs(isConnected, j, flag);
            }
        }
    }

    static int NumberOfProvinces(int[][] isConnected){
        int n = isConnected.length;
        boolean[] flag = new boolean[n];
        int ans = 0;
        for(int i =0; i<n; i++){
            if(!flag[i]){
                dfs(isConnected, i, flag);
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[][] isConnected;
        n = sc.nextInt();
        isConnected = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                isConnected[i][j]= sc.nextInt();
            }
        }
        System.out.println(NumberOfProvinces(isConnected));
    }
}
