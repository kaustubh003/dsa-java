package com.dsa.functions;

import java.util.Scanner;

public class VoteEligibility {
    public static boolean checkEligibility(int age) {
        if (age > 18)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean canVote = checkEligibility(age);
        System.out.println("Can vote: " + canVote);
    }
}
