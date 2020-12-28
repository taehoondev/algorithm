package com.java;

import java.util.FormatFlagsConversionMismatchException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];

        int[] bbb = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ccc = {8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < 8; i++) {햐
            if (arr[i] == bbb[i] & arr[7] == bbb[7]) {
                String a = "ascending";
                System.out.println(a);
            } else if (arr[i] == ccc[i] & arr[7] == bbb[7]) {
                String a = "descending";
                System.out.println(a);
            } else {
                String a = "mixed";
                System.out.println(a);
            }
        }
    }
}
