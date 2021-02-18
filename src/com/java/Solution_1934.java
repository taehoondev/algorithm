package com.java;

import java.util.*;

/*
1. t 입력.
2. t 만큼 a, b 입력 // 각각 최-공배수 출력.
 */
public class Solution_1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr_same = new ArrayList<>();

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();


            for (int j = 1; j < a+1; j++) {
                if (a%j==0 && b%j==0) {
                    arr_same.add(j);
                }
            }
            Collections.sort(arr_same);
            int maxi = arr_same.get(arr_same.size() - 1);
            arr_same = new ArrayList<>();
            System.out.println(maxi*(a/maxi)*(b/maxi));
        }
    }
}
