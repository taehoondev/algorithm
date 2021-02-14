package com.java;

import java.util.Arrays;
import java.util.Scanner;

/*
1. n개를 입력받는다.
2. n개 만큼 수를 입력받고 나열한다.
 */
public class Solution_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
