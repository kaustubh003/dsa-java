package com.dsa.strings;

import java.util.Scanner;

public class CumulativeOfStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int length = 0;
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next();
            length += array[i].length();
        }
        System.out.println(length);
    }
}
