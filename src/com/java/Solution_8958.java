package com.java;

/*

1. 스캐너로 숫자 입력받기
2. for문으로 숫자만큼 문자열 입력받기
3. 카운트하기 sum += ++count

 */

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.ForkJoinPool;

public class Solution_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int sum = 0;
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    sum += ++count;
                } else count = 0;
            }
            System.out.println(sum);
        }
    }
}
