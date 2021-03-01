package com.java;

import java.util.Scanner;

/*
1. 횟수 입력
2. 입력된 값만큼 숫자 입력
3. 1~23 중 입력된 값의 각 개수 출력
 */
public class Solution_1093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int[] arr = new int[23];
        for (int i = 0; i < 23; i++) {
            arr[i]=0;
        }

        for (int i = 0; i < a; i++) {
            int getNum = scanner.nextInt();
            arr[getNum-1]++;
        }


        for (int i = 0; i < 23; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
