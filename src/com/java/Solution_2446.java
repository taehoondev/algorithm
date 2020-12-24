package com.java;

import java.util.Scanner;

public class Solution_2446 {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        int N = inputNumber.nextInt();

        for (int i = 1; i<=N; i++) {
            for (int j = 1; j<i; j++) {
                System.out.print(" "); }
            for (int k = 0; k<((2*N-1)-(2*(i-1))); k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 1; i<N; i++) {
            for (int j = N-2; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; ((2*i)+1)>k; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
