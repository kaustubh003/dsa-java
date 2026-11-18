package com.dsa.functions;

import java.util.Scanner;

public class FactorialOfANumber {

    public static void printFactorial(int num) {
        if (num < 0)
            System.out.println("Invalid number");

        if (num == 0 || num == 1)
            System.out.println(1);

        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printFactorial(num);
    }
}
