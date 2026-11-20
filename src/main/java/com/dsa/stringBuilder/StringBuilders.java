package com.dsa.stringBuilder;

public class StringBuilders {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kaustubh");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'M');
        System.out.println(sb);

        // insert character at index
        sb.insert(0, 'B');
        System.out.println(sb);

        // delete character at index
        sb.delete(0, 1);
        System.out.println(sb);

        // append string
        StringBuilder sb2 = new StringBuilder("h");
        sb2.append("e");
        sb2.append("l");
        sb2.append("l");
        sb2.append("o");
        System.out.println(sb2);
        System.out.println(sb2.length());
    }
}
