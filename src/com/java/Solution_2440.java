package com.java;

import java.util.Scanner;

public class Solution_2440 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        int N = inputNumber.nextInt();

        for (int i = 1; i<=N; i++) {
            for (int j = i; j<=N; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
