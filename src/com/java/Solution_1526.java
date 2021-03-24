package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1526 {
    public static void output() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[max]<arr[i]) {
                max=i;
            }
        }
        System.out.println(max+1);
    }
    public static void main(String[] args) {
        output();
    }
}
