package com.DSA.foundations;

import java.util.Scanner;

// example -
// 15234 -> 41235
public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int inv = 0;
        int op = 1;
        while (num != 0) {
            int od = num % 10;
            int id = op;
            int ip = od;

            // make change to inv using ip and id
            inv = inv + id * (int) Math.pow(10, ip - 1);

            num = num / 10;
            op++;
        }
        System.out.println(inv);
    }
}
