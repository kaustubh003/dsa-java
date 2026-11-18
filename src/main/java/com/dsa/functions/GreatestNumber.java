package com.dsa.functions;

import java.util.Scanner;

public class GreatestNumber {

    public static int greatestNumber(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Greatest number: " + greatestNumber(num1, num2));
    }
}
