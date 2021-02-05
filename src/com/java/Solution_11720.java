package com.java;

import java.util.Scanner;

public class Solution_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long number = sc.nextInt();
        long sum = 0;
        while (number > 0) {
            long a = number % 10;
            sum += a;
            number /= 10;
        }
        sc.close();
        System.out.println(sum);
    }
}
