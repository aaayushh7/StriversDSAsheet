package com.company;

import java.util.Scanner;

public class MrLee {

    static int N;
    static int result;

    static void findMinCost(int[][] costs, boolean[] visited, int count, int currentCost, int currentCity){
        if(count == N-1){
            if(costs[currentCity][0]!=0){
                result = Math.min(result, currentCost+costs[currentCity][0]);
            }
            return;
        }
        for(int nextCity=0; nextCity<N;nextCity++){
            if(!visited[nextCity] && costs[currentCity][nextCity]!=0){
                visited[nextCity]=true;
                findMinCost(costs, visited, count+1, currentCost+costs[currentCity][nextCity], nextCity );
                visited[nextCity]=false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        while(testCase-->0){
            N = sc.nextInt();

            int[][] costs = new int[N][N];
            boolean[] visited = new boolean[N];

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    costs[i][j]=sc.nextInt();
                }
            }

            result = Integer.MAX_VALUE;
            visited[0]=true;

            findMinCost(costs, visited, 0, 0, 0);

            System.out.println(result != Integer.MAX_VALUE? result: -1);
        }
    }
}
