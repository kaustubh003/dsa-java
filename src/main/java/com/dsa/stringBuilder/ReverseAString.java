package com.dsa.stringBuilder;

public class ReverseAString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < sb.length() / 2; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length() - 1 - i));
            sb.setCharAt(sb.length() - 1 - i, temp);
        }
        System.out.println(sb);
    }
}
