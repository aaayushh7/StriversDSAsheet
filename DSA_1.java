package com.company;
import java.util.Scanner;
import java.util.Arrays;

//square root method
public class DSA_1 {
    public static void main(String[] args) {

        /*int m;
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        int c = 2;
        while(c*c<=m){
            if(m % c == 0) {
                System.out.println("Not a prime number!");
                break;
            }
            c++;
        }
        int n = sc.nextInt();
        int a =0;
        int b =1;
        for(int i=2;i<n;i++){
            int temp = b;
            b =a+b;
            a=temp;
        }
        System.out.println(b);*/
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int rem = n%10;
            if (rem == 7){
                count++;
            }
            n/=10;
        }
        System.out.println("The 7 appeared "+count+" times.");*/
        Scanner sc = new Scanner(System.in);
        /*int ans = 0;
        //int a = sc.nextInt();
        while (a>0){
            int rem = a%10;
            ans = (ans*10)+rem;
            a/=10;
        }
        //System.out.println(ans);*/

        int[] arr = {1,2,3,4,5,6};
        //change(arr);
        System.out.println(Arrays.toString(arr));
        boolean isPrime = prime(7);
        System.out.println(isPrime);

    }
    static void change(int[] num){
        num[0] = 90;

    }
    static boolean prime(int g){
        if(g<=1){
            return false;
        }
        int c = 2;
        while(c*c<g){ //less time space complexity!
            if(g % c == 0){
                return true;
            }
            c++;
        }
        if(c*c>g){
            return true;
        }
        return false;
    }


}

