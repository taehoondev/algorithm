package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        int b = Integer.parseInt(a);
        int min;

        String a1 = bufferedReader.readLine();
        String[] arr = a1.split(" ");
        int o = Integer.parseInt(arr[0]);
        min=o;

        for (int i = 1; i < b; i++) {
            if (min>Integer.parseInt(arr[i])) {
                min=Integer.parseInt(arr[i]);
            }
        }
        System.out.println(min);
    }
}
