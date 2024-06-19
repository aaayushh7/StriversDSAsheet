
package com.company;

public class AdjasentDistances {
    public static void main(String[] args) {

//   question :  Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary representation of n.
//        If there are no two adjacent 1's, return 0.
//        Two 1's are adjacent if there are only 0's separating them (possibly no 0's). The distance between two 1's is the absolute
//        difference between their bit positions. For example, the two 1's in "1001" have a distance of 3.

        int ans = solution(88);
        System.out.println(ans);

    }
    static int solution(int num){
        //conversion to binary
        int arr[];
        arr = new int[10];
        int i  =0;
        int h = num;
        while(h>=1){
            if(h==1){
                arr[i]=1;
            }
            else{
                arr[i]=h%2;
                i++;
            }
            h/=2;
        }
        int max = 0;

        for(int n = 0;n<=i;n++){
            int count = 0;
            if(arr[n]==1){
                for(int j = n+1;j<=i;j++){

                    if(arr[j] == 0){
                        count++;
                    }
                    else{
                        count++;
                        break;
                    }
                }
                if(max<count){
                    max=count;
                }
            }
        }
        return max;


    }
}
