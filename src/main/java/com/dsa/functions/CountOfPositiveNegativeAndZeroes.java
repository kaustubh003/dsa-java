package com.dsa.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountOfPositiveNegativeAndZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int positive = 0, negative = 0, zeroes = 0;
        int number;

        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            if (number > 0)
                positive++;
            else if (number < 0) {
                negative++;
            } else {
                zeroes++;
            }
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeroes: " + zeroes);

    }
}
