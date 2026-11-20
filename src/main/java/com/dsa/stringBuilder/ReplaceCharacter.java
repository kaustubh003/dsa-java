package com.dsa.stringBuilder;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            if ('e' == sb.charAt(i)) {
                sb.setCharAt(i, 'i');
            }
        }
        System.out.println(sb);
    }
}
