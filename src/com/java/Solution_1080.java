package com.java;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Solution_1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;

        for (int i = 1; true ; i++) {
            b+=i;
            if (b>=a) {
                System.out.println(i);
                break;
            }
        }
    }
}
