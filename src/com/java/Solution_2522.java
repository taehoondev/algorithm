package com.java;

import java.util.Scanner;

public class Solution_2522 {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        int N = inputNumber.nextInt();

        for (int i = 0; i<N; i++) {
            for (int j = i; j+1<N; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i<N; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k<N; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
