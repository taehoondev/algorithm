package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_2455 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int[] brr = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int outPeople = sc.nextInt();
            int inPeople = sc.nextInt();
            arr[i] = inPeople - outPeople;
        }
        brr[0] = arr[0];
        for (int i = 1; i < 4; i++) {
                brr[i] = brr[i-1]+arr[i];
        }
        Arrays.sort(brr);
        System.out.println(brr[3]);
    }
}
