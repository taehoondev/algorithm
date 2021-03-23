package com.java;

import java.io.ObjectInputFilter;
import java.util.Scanner;

/*
1. n 입력받는다. n만큼 키,몸무게 각각을 입력받는다.
x와 y가 모두 다 클 경우, 순위 매긴다. 그렇지 않고 몸무게나 키 중 하나만 클 경우, 같은 순위 매긴다.
2. 순위를 출력한다.
 */
public class Solution_7568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i==j) continue;
                if (arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1])  {
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }
    }
}
