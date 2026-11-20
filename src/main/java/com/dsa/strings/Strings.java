package com.dsa.strings;

public class Strings {
    public static void main(String[] args) {
        // concatenation
        String firstName = "Kaustubh";
        String lastName = "Bhosale";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // compare
        // s1 > s2 = +ve value
        // s1 == s2 = 0
        // s1 < s2 = -ve value
        String name1 = "Tony";
        String name2 = "Tony";
//        if (name1.compareTo(name2) == 0) {
//            System.out.println("Strings are equal");
//        } else {
//            System.out.println("Strings are not equal");
//        }

        // substring
        String sentence = "KaustubhBhosale";
        String name = sentence.substring(8);
        System.out.println(name);

        // Strings are Immutable

        // String to int
        String str = "123";
        int x = Integer.parseInt(str);
        System.out.println(x);
        str = Integer.toString(x);
        System.out.println(str.length());
    }
}
