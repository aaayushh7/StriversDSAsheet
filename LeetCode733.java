package com.company;

import java.util.Arrays;

public class LeetCode733 {
    public static void main(String[] args) {
        int[][] image = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int sc = 0, sr = 0, color = 0;
        int[][] result = floodFill(image, sr, sc, color);
        System.out.println(Arrays.deepToString(result));
    }

    private static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int source = image[sr][sc];
        image[sr][sc] = color;
        dfs(image, sr, sc, color, source);
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc, int color, int source) {
        if(source==color){
            return;
        }
        int[][] directions = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        for (int[] dir : directions) {
            int nr = sr + dir[0], nc = sc + dir[1];
            if (nr >= 0 && nr < image.length && nc >= 0 && nc < image[0].length && image[nr][nc] == source) {
                image[nr][nc] = color;
                dfs(image, nr, nc, color, source);
            }
        }
    }
}