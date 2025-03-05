package com.company;

import java.util.Scanner;

public class MrKim {

    static int[] x;
    static int[] y;
    static int n; //number of customers
    static int result;

    static int calculateDistance(int i, int j){
        int x1=x[i], x2=x[j];
        int y1=y[i], y2=y[j];
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }

    static void findOptimal(int currentPoint, boolean[] visited, int customerVisited, int currentDistance){
        if(customerVisited==n){
            result = Math.min(result,currentDistance + calculateDistance(currentPoint, 1));
            return;
        }
        for(int m=2;m<n+2;m++){
            if(!visited[m]){
                visited[m]=true;
                findOptimal(m, visited, customerVisited+1, currentDistance+calculateDistance(currentPoint,m));
                visited[m]=false;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int t=0;t<testCase;t++){
            n = sc.nextInt();
            x = new int[n+2];
            y = new int[n+2];

            x[0]=sc.nextInt();
            y[0]=sc.nextInt();  //office coordinates

            x[1]=sc.nextInt();
            y[1]=sc.nextInt();

            for(int i=2;i<n+2;i++){
                x[i]=sc.nextInt();
                y[i]=sc.nextInt();
            }

            boolean[] visited = new boolean[2*n+4];
            result = Integer.MAX_VALUE;

            findOptimal(0,visited, 0, 0);
            System.out.println("#"+(t+1)+" "+result);
        }

    }
}
