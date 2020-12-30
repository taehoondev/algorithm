package com.java;

import java.util.Scanner;

public class Solution_2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m >= 45) {
            System.out.println(h + " " + (m - 45));
            if (m == 0) {
                System.out.println(h);
            }
        }
        if (h != 0 && m < 45) {
            System.out.println((h - 1) + " " + (m + 15));
        }
        if (h == 0 && m < 45) {
            System.out.println(23 + " " + (m + 15));
        }
    }
}
