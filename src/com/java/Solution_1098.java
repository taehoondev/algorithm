package com.java;

import java.util.Scanner;

/*
1. 좌표 입력받고 격자판 만든다.
2. 막대 개수 입력받는다.
3. 개수만큼 좌표부터...
 */
public class Solution_1098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // 세로
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];

        int getNum = scanner.nextInt();
        for (int i = 0; i < getNum; i++) {
            int l = scanner.nextInt();
            int d = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            for (int j = 0; j < l; j++) {
                if (d == 0) {
                    arr[a-1][b-1] = 1;
                    b++;
                } else if (d == 1) {
                    arr[a-1][b-1] = 1;
                    a++;
                }
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
