package com.java;

import java.util.Scanner;

public class Solution_2908 {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        int a = inputNumber.nextInt();
        int b = inputNumber.nextInt();

        int a100 = a/100;
        int a10 = a/10%10;
        int a1 = a%10;
        int b100 = b/100;
        int b10 = b/10%10;
        int b1 = b%10;

        int newA = 100*a1+10*a10+a100;
        int newB = 100*b1+10*b10+b100;

        if (newA<newB) {
            System.out.println(newB);
        }
        else System.out.println(newA);
    }
}
