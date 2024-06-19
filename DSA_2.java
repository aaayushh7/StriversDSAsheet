package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DSA_2 {
    public static void main(String[] args) {
        int[] array = {12,32,43,25,3,3423,53,43,534,23,3,-9};
        int target = 3423;
        int check = linearSearch(array, target);
        System.out.println(check);
        int check2 = linearSearch2(array,target);
        System.out.println(check2);
        
        //linear search in string 
        String str = "Ayush";
        char target2 = 'u';
        System.out.println(linearSearchstr(str,target2));
        System.out.println(search2(str,target2));

        // changing the string to arraylist
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(search3(array,2,6,3423));
        System.out.println(search4(array));

        //search in 2 dimensional array
        int[][] array2 = {
                {1,23,45,3},
                {23,42,34,2,4,3},
                {23,4,23,4,3,29,3},
                {32,4,324}
        };
        int[] ans = search2d(array2,29);
        System.out.println("The target is found at respective rows and column: " + Arrays.toString(ans));

        System.out.println(Integer.MIN_VALUE);

    }

    static int[] search2d(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    //search in for minimum value
    static int search4(int[] arr){
        int min = arr[0];
        for(int i =1;i<arr.length;i++){
            if(min>arr[i]){
                    min = arr[i];
            }
        }
        return min;
    }

    //search in RangeIndex
    static boolean search3(int[] arr,int start,int end,int target){
        if (arr.length == 0 ){
            return false;
        }
        for(int i = start;i<=end;i++){
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }
    static boolean search2 (String str,char target2){
        if(str.length()==0){
            return false;
        }
        for(int i = 0;i<str.length();i++){
            if(target2 == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean linearSearchstr(String str, char target2){
        if (str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if (ch == target2){
                return true;
            }
        }
        return false;
    }
    static int linearSearch2(int[] arr3,int target){
        if (arr3.length==0){
            return -1;
        }
        for (int element : arr3){
            if (element == target){
                return 1;
            }
        }
        return -1;
    }
    static int linearSearch(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }
        for (int i =0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;

    }
}
