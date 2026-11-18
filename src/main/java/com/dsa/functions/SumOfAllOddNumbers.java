package com.dsa.functions;

import java.util.Scanner;

public class SumOfAllOddNumbers {

    public static void printOddNumbersTillN(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i = i + 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printOddNumbersTillN(n);
    }
}
