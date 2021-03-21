package com.java;

import java.util.Scanner;

public class Practice_2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String getLetter = scanner.nextLine();
        String[] arr = getLetter.split("");
        int num = getLetter.length();

        for (int i = 0; i < getLetter.length(); i++) {   // 0~7 (8)
            if (arr[i].equals("-")) {
                num -= 1;
            }
            if (arr[i].equals("=")) {
                num -= 1;
            }
            if (i != getLetter.length() - 1 && i != getLetter.length() - 2) {
                if (arr[i].equals("d") && arr[i + 1].equals("z") && arr[i + 2].equals("=")) {
                    num -= 1;
                }
            }
            if (i != getLetter.length() - 1) {
                if (arr[i].equals("l") && arr[i + 1].equals("j")) {
                    num -= 1;
                }
            }
            if (i != getLetter.length() - 1) {
                if (arr[i].equals("n") && arr[i + 1].equals("j")) {
                    num -= 1;
                }
            }
        }
        System.out.println(num);
    }
}
