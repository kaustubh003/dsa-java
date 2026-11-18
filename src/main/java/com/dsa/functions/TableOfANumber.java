package com.dsa.functions;

import java.util.Scanner;

public class TableOfANumber {

    public static void printTable(int num) {
        if (num < 1)
            System.out.println("Invalid input");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        printTable(num);
    }
}
