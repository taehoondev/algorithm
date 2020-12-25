package com.java;

import java.util.Scanner;

public class Solution_2443 {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        int N = inputNumber.nextInt();

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * N - (2 * i + 1)); j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
