package com.dsa.functions;

import java.util.Scanner;

public class CircumferenceOfACircle {

    public static double circumference(int radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.printf("Circumference: %.2f", circumference(radius));
    }
}
