package com.java;

import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;

public class Practice_2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            for (int j = n * 2; j > 2 * i + 2; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print('*');
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
