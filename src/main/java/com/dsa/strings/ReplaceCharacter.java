package com.dsa.strings;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String original = "abcdefghi";
//        String result = original.replace('e', 'i');
        String result = "";
        for (int i = 0; i < original.length(); i++) {
            if ('e' == original.charAt(i))
                result += 'i';
            else
                result += original.charAt(i);
        }

        System.out.println(result);
    }
}
