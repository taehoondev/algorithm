package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1. 테스트개수 스캐너로 입력
2.
 */
public class Solution_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int number = sc.nextInt();
            String inputString = sc.next();
            for (int j = 0; j < inputString.length(); j++) {
                for (int k = 0; k < number; k++) {
                    System.out.print(inputString.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
