package com.dsa.bitManipulation;

import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;
        int notBitMask = ~bitMask;

        // Get bit
        if ((bitMask & n) == 0) {
            System.out.println("Bit is zero");
        } else {
            System.out.println("Bit is one");
        }

        // Set bit
        int newNumber = bitMask | n;
        System.out.println(newNumber);

        // Clear bit
        int newNumber2 = notBitMask & n;
        System.out.println(newNumber2);

        // Update bit
        int oper = sc.nextInt(); // update bit to 1 else update bit to 0
        if (oper == 1) {
            // set
            int newNumber3 = bitMask | n;
            System.out.println(newNumber3);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber3 = newBitMask & n;
            System.out.println(newNumber3);
        }
    }
}
