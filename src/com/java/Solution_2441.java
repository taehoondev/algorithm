package com.java;

import java.util.Scanner;

public class Solution_2441 {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        int N = inputNumber.nextInt();

        for (int i = 1; i<=N; i++) {
            for (int j = 0; j<i-1; j++) {
                System.out.print(" ");
            }
            for (int k = N; k-i>=0; k--) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
