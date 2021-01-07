package com.java;

import java.util.Scanner;

public class Solution_10886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
int sum = 0;
        for (int i = 0; i<n; i++) {
            int a = sc.nextInt();
            sum += a;
        }
        if (sum > (n/2)) {
            System.out.println("Junhee is cute!");
        }
        else {
            System.out.println("Junhee is not cute!");
        }
    }
}
