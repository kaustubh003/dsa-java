package com.DSA.foundations;

import java.util.Scanner;

public class IsANumberPrime {
    public static void main(String[] args) {
        int t, num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of inputs: ");
        t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            num = sc.nextInt();
            int count = 0;

            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

    }
}
