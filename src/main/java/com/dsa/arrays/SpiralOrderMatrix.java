package com.dsa.arrays;

import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] twoDArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = sc.nextInt();
            }
        }

        int rowStart = 0;
        int columnStart = 0;
        int rowEnd = rows - 1;
        int columnEnd = cols - 1;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            for (int i = columnStart; i <= columnEnd; i++) {
                System.out.print(twoDArray[rowStart][i] + " ");
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(twoDArray[i][columnEnd] + " ");
            }
            columnEnd--;
            for (int i = columnEnd; i >= columnStart; i--) {
                System.out.print(twoDArray[rowEnd][i] + " ");
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(twoDArray[i][columnStart] + " ");
            }
            columnStart++;
            System.out.println();
        }
    }
}
