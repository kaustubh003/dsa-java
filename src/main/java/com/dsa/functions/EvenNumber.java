package com.dsa.functions;

import java.util.Scanner;

public class EvenNumber {

    public static void printEvenOrOdd(int num) {
        if (num % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        printEvenOrOdd(num);
    }
}
