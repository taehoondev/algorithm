package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        StringTokenizer st = new StringTokenizer(sc.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int allDouble = 1;

        for (int i = 1; i < a + 1; i++) {
            if (a % i == 0 && b % i == 0) {
                arr.add(i);
            }
        }
        int mini = arr.get(arr.size() - 1);
        System.out.println(mini);

        for (int i = 0; i < arr.size() - 1; i++) {
            allDouble *= arr.get(i);
        }
        System.out.println(mini * (a / mini) * (b / mini));
    }
}
