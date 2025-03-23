package com.company;

import java.util.Scanner;

public class DecodeGFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        decodeArray(str);
    }
    private static void decodeArray(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println(0);
            return;
        }

        int n = str.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        if (str.charAt(0) == '0') {
            System.out.println(0);
            return;
        } else {
            dp[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(str.substring(i-1, i));

            int twoDigits = Integer.parseInt(str.substring(i-2, i));

            if (oneDigit >= 1) {
                dp[i] += dp[i-1];
            }

            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i-2];
            }
        }

        System.out.println(dp[n]);
    }
}
