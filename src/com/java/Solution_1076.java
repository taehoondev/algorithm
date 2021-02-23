package com.java;

import java.util.Scanner;

public class Solution_1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        int b = (int) a;

        for (int i = 97; i <= b; i++) {
            char c = (char) i;
            System.out.println(c);
        }
    }
}
