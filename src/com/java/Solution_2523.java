package com.java;

import java.util.Scanner;

public class Solution_2523 {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        int N = inputNumber.nextInt();

        for (int i = 0; i<N; i++) {
            for (int j = 0; i>=j; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i<N; i++) {
            for (int j = i; j<N; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
