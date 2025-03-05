package com.company;

import java.util.Scanner;

public class prism {
    static int N;
    static int[][] gameZone;
    static int coin=0;
    static int count=0;
    static int result;
    static int bomb = 0;

    static void planePosition(int[][] gameZone, int nextX, int nextY) {
        result = Math.max(result, coin);
        if (coin == -1 || count == N || nextX < 0 || nextY >= 5 || nextY < 0) {
            return;
        }
        if (gameZone[nextX][nextY] == 2 && coin == 0 && bomb == 0) {
            return;
        }
        if (gameZone[nextX][nextY] == 2) {
            if (bomb == 0) {
                bombing(nextX);
            } else {
                coin--;
            }
            count++;
        } else if (gameZone[nextX][nextY] == 1) {
            coin++;
            count++;
        }
        planePosition(gameZone, nextX - 1, nextY);
        planePosition(gameZone, nextX - 1, nextY + 1);
        planePosition(gameZone, nextX - 1, nextY - 1);
    }

    static void bombing(int nextX){
        for(int i=nextX; i>=0;i--){
            for(int j=0;j<5;j++){
                if(gameZone[i][j]==2){
                    gameZone[i][j]=0;
                }
            }
        }
        bomb++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        gameZone = new int[N+1][5];

        for(int i=0;i<N;i++){
            for(int j =0; j<5;j++){
                gameZone[i][j]= sc.nextInt();
            }
        }
        planePosition(gameZone, N, 3);
        planePosition(gameZone, N, 2);
        planePosition(gameZone, N, 1);
        System.out.println(result);
    }
}

