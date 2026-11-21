package com.dsa.bitManipulation;

import java.util.Scanner;

public class CheckPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
