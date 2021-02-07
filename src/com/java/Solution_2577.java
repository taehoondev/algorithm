package com.java;

import javafx.beans.property.FloatProperty;

import java.util.Scanner;

public class Solution_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int number = a*b*c;

        int[] arr = new int[10];

        String numbers = String.valueOf(number); // String
        for (int i = 0; i < numbers.length(); i++) {
            int d = Character.getNumericValue(numbers.charAt(i));
            arr[d]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }

    /*
    1. a,b,c 스캐너로 입력받고, a*b*c 선언.
    2. 배열 10자리 선언.
    3. charAt 로 각 자릿수 대입. for문.
     */
}