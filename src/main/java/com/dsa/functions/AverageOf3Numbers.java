package com.dsa.functions;

import java.util.Scanner;

public class AverageOf3Numbers {

    public static void printAverage(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        System.out.println(average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        printAverage(num1, num2, num3);
    }
}
