package com.dsa.stringBuilder;

import java.util.Scanner;

public class CreateUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') {
                str.delete(i, str.length());
            }
        }

        System.out.println(str);
    }
}
