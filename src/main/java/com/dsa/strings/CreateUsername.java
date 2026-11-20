package com.dsa.strings;

import java.util.Scanner;

public class CreateUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
//        int index = 0;
//        for (int i = 0; i < email.length(); i++) {
//            if (email.charAt(i) == '@') {
//                index = i;
//                break;
//            }
//        }
//        String username = email.substring(0, index);
        String username = "";
        for (int i = 0; i < email.length(); i++) {
            if ('@' == email.charAt(i))
                break;
            else
                username += email.charAt(i);
        }

        System.out.println(username);
    }
}
