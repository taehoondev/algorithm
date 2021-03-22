package com.java;

import java.util.Scanner;

public class Solution_2609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min;

        if (a >= b) {
            for (int i = b; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    min = i;
                    System.out.println(i);

                    System.out.println(i*(a/i)*(b/i));

                    break;
                }
            }
        }
        if (a < b) {
            for (int i = a; i >= 1; i--) {
                if (b % i == 0 && a % i == 0) {
                    min = i;
                    System.out.println(i);
                    System.out.println(i*(a/i)*(b/i));
                    break;
                }
            }
        }
    }
}