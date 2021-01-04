package com.java;

import java.util.Scanner;

public class Practice_10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print(" ");
        }
        System.out.println('*');

        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            System.out.print('*');
            for (int j =(n+4)-(2*i); j < 2*n-1; j++) {
                System.out.print(" ");
            }
            System.out.print('*');
            System.out.println();
        }
        for (int i = 1; i < 2 * n; i++) {
            if (n != 1) {
                System.out.print('*');
            }
        }
    }
}
