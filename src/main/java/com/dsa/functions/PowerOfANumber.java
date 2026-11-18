package com.dsa.functions;

import java.util.Scanner;

public class PowerOfANumber {

    public static int power(int num, int pow) {
        if (pow == 0)
            return 1;

        int result = 1;
        for (int i = 0; i < pow; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int pow = sc.nextInt();

        System.out.println("Power of a number: " + power(num, pow));
    }
}
