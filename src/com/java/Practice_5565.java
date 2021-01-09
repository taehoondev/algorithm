package com.java;

import java.util.Scanner;

public class Practice_5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < 10; i++) {
            sum += arr[i];
        }
        System.out.println(arr[0] - sum);
    }
}
