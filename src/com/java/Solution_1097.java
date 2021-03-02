package com.java;

import java.util.Scanner;

public class Solution_1097 {
    public static void main(String[] args) {
        int[][] arr = new int[19][19];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int getNumber = scanner.nextInt();
        for (int i = 0; i < getNumber; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = 0; j < 19; j++) {
                if (arr[x-1][j]==0) {
                    arr[x-1][j]=1;
                }
                else if (arr[x-1][j]==1) {
                    arr[x-1][j]=0;
                }
                if (arr[j][y-1]==0) {
                    arr[j][y-1]=1;
                }
                else if (arr[j][y-1]==1) {
                    arr[j][y-1]=0;
                }
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}