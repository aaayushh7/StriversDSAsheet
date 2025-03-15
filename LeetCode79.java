package com.company;

import java.util.Arrays;

public class LeetCode79 {
    public static void main(String[] args) {
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        boolean result = exist(board, word);
        System.out.println(result);
    }
    static boolean exist(char[][] board, String word){
        char[] chars = word.toCharArray();
        boolean result=false;
        for(int i = 0; i<board.length; i++){
            for(int j = 0;j < board[0].length; j++){
                if(board[i][j]==chars[0]){
                   result = checkForChars(board, chars, i, j, 1);
                }
            }
        }
        return result;


    }
    static boolean checkForChars(char[][] board, char[] chars, int row, int col, int index){
        if(index== chars.length){
            return true;
        }
        int[][] directions = {{1,0},{0,1},{0,-1},{-1,0}};
        for(int[] dir: directions){
            int newRow = row+dir[0], newCol=col+dir[1];
            System.out.println("direction dir is : "+ Arrays.toString(dir));
            if(newRow>=0 && newRow < board.length && newCol>=0 && newCol< board[0].length){
                if(board[newRow][newCol]==chars[index]){
                    System.out.println("Got '"+chars[index]+"' At this index "+ newRow +" and "+ newCol);
                    return checkForChars(board, chars, newRow, newCol, index+1);
                }
            }
        }
        return false;
    }
}
