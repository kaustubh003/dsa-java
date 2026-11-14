package com.DSA.foundations;

import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        String number = String.valueOf(num);
//        for (char c : number.toCharArray())
//            System.out.println(c);

        int nod  = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        int div = (int) Math.pow(10, nod - 1);
        while (div != 0) {
            int quo = num / div;
            System.out.println(quo);

            num = num % div;
            div = div / 10;
        }
    }
}
