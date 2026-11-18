package com.dsa.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GCDOfTwoNumbers {

    public static int greatestCommonDivisor(int num1, int num2) {
        int smallestNumber = num1 > num2 ? num2 : num1;
        for (int i = smallestNumber; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("GCD: " + greatestCommonDivisor(num1, num2));
    }
}
