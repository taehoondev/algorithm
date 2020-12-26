package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_2562 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);

        int arr[] = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = getNumber.nextInt();
            if (arr[max] < arr[i]) {
                max = i;
                index = i;
            }
        }
        System.out.println(arr[max]);
        System.out.println(index + 1);
    }
}
