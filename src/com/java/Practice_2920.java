package com.java;

import java.util.Scanner;

/*
1. 8개의 숫자가 주어진다.
2. 결과에 맞게 출력한다.
 */
public class Practice_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i]=sc.nextInt();           //  [0]~[7]
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 7; j++) {
                if (arr[j]+1==arr[j+1]) {
                    System.out.println("ascending");
                }
                else if (arr[j]==arr[j+1]+1) {
                    System.out.println("descending");
                }
            }
        }
    }
}
