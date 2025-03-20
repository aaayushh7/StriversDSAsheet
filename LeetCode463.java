package com.company;

public class LeetCode463 {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(isIslandPerimeter(grid));
    }
    private static int isIslandPerimeter(int[][] grid) {
        int row = grid.length,col = grid[0].length;
        int[] perimeter ={0};
        boolean[][] vis =  new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    dfs(perimeter,grid,vis, i,j);
                }
            }
        }
        return perimeter[0];
    }
    private static void dfs(int[] perimeter, int[][] grid,boolean[][] vis, int row, int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
            perimeter[0]++;
            return;
        }
        if(vis[row][col]){
            return;
        }
        vis[row][col]=true;
        dfs(perimeter,grid,vis,row+1,col);
        dfs(perimeter,grid,vis,row-1,col);
        dfs(perimeter,grid,vis,row,col+1);
        dfs(perimeter, grid, vis, row, col-1);

    }
}
