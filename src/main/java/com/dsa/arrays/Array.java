package com.dsa.arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
//        int[] marks = new int[3];
        int[] numbers = new int[size];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 95;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (x == numbers[i])
                System.out.println("x found at index: " + i);
        }
    }
}
