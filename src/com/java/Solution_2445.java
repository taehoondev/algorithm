package com.java;

import java.util.Scanner;

public class Solution_2445 {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        int N = inputNumber.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            for (int k = 0; k < (N * 2) - (2 * (i + 1)); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j++) {
                System.out.print('*');
            }
            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < N; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
