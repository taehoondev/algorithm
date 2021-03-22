package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
1. n input
2. split으로 쪼개고 그 배열을 내림차순으로 정렬

 */
public class Solution_1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arr = a.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
