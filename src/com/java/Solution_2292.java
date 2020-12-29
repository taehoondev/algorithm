package com.java;

import java.util.Scanner;

public class Solution_2292 {
    //1, 6(7), 12(19), 18
    // 1-1,   2~7 = 2   8~19 = 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // if (n=2~7)   :  2        1+     6
        // if (n=8~19) :  3        7+     6*2
        // if  (n=20~37) : 4       19+    6*3
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += n;
            if (sum < 6 * i) {

            }
        }
    }
}
