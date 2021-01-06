package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int[] arrSum = new int[4];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];   // 4개   ,  sum은 5
            }
            arrSum[i] = sum;   //  5개
        }
        int[] arrCopy = arrSum;
        Arrays.sort(arrSum);
        System.out.print(arrSum[4]+" ");
        int index = Arrays.binarySearch(arrCopy, arrSum[4]);
    }
}
