package com.java;

import java.util.Scanner;

public class Solution_2444 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int N = inputNumber.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i<N; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<(2*N)-(2*i+1); k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
