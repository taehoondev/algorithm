package com.java;

import javafx.beans.property.IntegerProperty;

import java.util.Scanner;

/*
1. t 입력받는다.
2. for문으로 t만큼 scanner로 스트링 입력받는다.
3. substring으로 ,로 나누
 */
public class Solution_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String str = sc.next();
            String[] arr = str.split("");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);

            System.out.println(a+b);
        }
    }
}
