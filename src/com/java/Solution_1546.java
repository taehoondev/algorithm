package com.java;

import java.util.Arrays;
import java.util.Scanner;

/*
0. n 구하고, 과목의 점수를 입력받는다.
1. 최댓값을 구한다.
2. 모든 점수 다시 고치기.
3. 평균을 구한다.
 */
public class Solution_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double a = arr[n - 1];
        double d = 0;

        double[] arr2 = new double[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = (arr[i] / a) * 100;
            d += arr2[i];
        }
        System.out.println(d / n);
    }
}
