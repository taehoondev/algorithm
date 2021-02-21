package com.java;

import java.util.Scanner;

public class Solution_1046 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a+b+c);
        System.out.printf("%.1f", ((double)a+(double)b+(double)c)/3);
    }
}
