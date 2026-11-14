package com.DSA.foundations;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int digits = 0;

        do {
            num = num / 10;
            digits++;
        } while (num >= 1);

        System.out.println(digits);
    }
}
