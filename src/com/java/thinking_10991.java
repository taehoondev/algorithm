package com.java;

import java.util.Scanner;

public class thinking_10991 {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        int N = inputNumber.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}
