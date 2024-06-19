package com.company;

public class CN_reverse {
    public static void main(String[] args) {
        long n =12;
        String binary = String.format("%32s",Long.toBinaryString(n)).replace(' ', '0');
        String reverseBinary = new StringBuilder(binary).reverse().toString();
        long reverseLong = Long.parseLong(reverseBinary,2);
        System.out.println(reverseLong);
    }
}
