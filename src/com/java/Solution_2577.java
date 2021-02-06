package com.java;

import java.util.Scanner;

public class Solution_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = getResult(sc);
        String numbers = String.valueOf(result);
        int[] counter = getCounter(numbers);
        print(counter);
    }

    private static int getResult(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        return a * b * c;
    }

    private static int[] getCounter(String numbers) {
        int[] counter = new int[10];

        for (int i = 0; i < numbers.length(); i++) {
            char number = numbers.charAt(i); //char
            String s = String.valueOf(number); //char -> String
            int convertedNumber = Integer.parseInt(s); // string -> int

            counter[convertedNumber]++;
        }
        return counter;
    }

    private static void print(int[] counter) {
        for (int i = 0; i < counter.length; i++) {
            System.out.println(counter[i]);
        }
    }
}