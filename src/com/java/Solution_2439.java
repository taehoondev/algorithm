package com.java;

import java.util.Scanner;

public class Solution_2439 {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        int N = inputNumber.nextInt();

        for (int i = 1; i<=N; i++) {
            for (int j = N-i; j>0; j--) {
                System.out.print(" ");}
            for (int k = 1; k<=i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
