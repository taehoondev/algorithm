package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[7];
        int[] arr = new int[7];
        int sum = 0;
        int min;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 == 1) {
                arr[i] = numbers[i];
            }
            sum += arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                min = arr[i];
                System.out.println(sum);
                System.out.println(min);
                break;
            }
            else if (arr[6] == 0) {
                System.out.println(-1);
                break;
            }
        }
    }
}
