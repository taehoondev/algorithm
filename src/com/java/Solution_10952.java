package com.java;

import java.util.Scanner;

public class Solution_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        do {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a == 0 && b == 0) {
                return;
            }
            System.out.println(a + b);


        } while (true);

    }
}