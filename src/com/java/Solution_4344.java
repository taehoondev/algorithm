package com.java;

import java.util.Scanner;

/*
1. C 케이스 개수 입력
2. 각 케이스 마다 N 입력받고, N만큼 점수 입력받는다.
3. 평균 넘는 학생의 비율 구한다. ( 소수 셋 째 자리까지)
 */
public class Solution_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            double sum = 0;

            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            double average = sum/n;
            double count =0;

            for (int j = 0; j < n; j++) {
                if (average<arr[j]) {
                    count ++;
                }
            }
            System.out.printf("%.3f%%\n",(count/n*100));
        }
    }
}
