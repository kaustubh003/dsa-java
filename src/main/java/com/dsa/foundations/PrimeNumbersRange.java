package com.dsa.foundations;

import java.util.Scanner;

public class PrimeNumbersRange {
    public static void main(String[] args) {
        int low, high;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter low: ");
        low = sc.nextInt();

        System.out.println("Enter high: ");
        high = sc.nextInt();

        for (int i = low; i <= high; i++) {
            if (isNumberPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isNumberPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
