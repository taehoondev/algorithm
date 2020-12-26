package com.java;

import java.util.Scanner;

public class Solution_10992 {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        int N = inputNumber.nextInt();

        for (int i = 1; i < N; i++) {
            System.out.print(" ");
        }
        System.out.print('*');
        System.out.println();

        for (int i = 1; i < N-1; i++) {
            for (int j = i + 1; j < N; j++) {
                System.out.print(" ");
            }
            System.out.print('*');
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(" ");
            }
            System.out.print('*');
            System.out.println();
        }
        for (int i = 0; i<2*N-1; i++) {
            if (N!=1)
                System.out.print('*');
        }
    }
}
