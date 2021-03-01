package com.java;

import java.util.Scanner;

public class Solution_1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = a-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
