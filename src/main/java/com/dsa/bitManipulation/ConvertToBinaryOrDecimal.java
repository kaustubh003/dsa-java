package com.dsa.bitManipulation;

import java.util.Scanner;

public class ConvertToBinaryOrDecimal {
    public static String convertDecimalToBinary(int num) {
        StringBuilder binary = new StringBuilder("");
        while (num != 0) {
            int temp = num % 2;
            binary.append(temp);
            num = num / 2;
        }
        return String.valueOf(binary.reverse());
    }

    public static int convertBinaryToDecimal(String binary) {
        int number = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
//            number = (int) ((Math.pow(2, i) * Character.getNumericValue(binary.charAt(length - i - 1))) + number);
            char bit = binary.charAt(i);
            if (bit == '0' || bit == '1')
                number = (number << 1) | (bit - '0');
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = convertDecimalToBinary(n);
        System.out.println(binary);
        System.out.println(convertBinaryToDecimal(binary));
    }
}
