package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int[] arr = {x, y, w - x, h - y};
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
