package com.company;

public class LeetCode73 {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}};
        setZeroes(arr);
//        System.out.println(Arrays.toString(arr));
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    static void setZeroes(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[] rows = new int[row];
        int[] cols = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rows[i]==1 || cols[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
