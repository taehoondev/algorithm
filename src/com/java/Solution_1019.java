package com.java;

import java.util.Scanner;

public class Solution_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();

        String[] arr = t.split("\\.");
        int a = Integer.valueOf(arr[0]);
        int b = Integer.valueOf(arr[1]);
        int c = Integer.valueOf(arr[2]);
        System.out.printf("%04d.%02d.%02d", a,b,c);
    }
}
