package com.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1088 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.valueOf(bufferedReader.readLine());

        for (int i = 1; i <= b; i++) {
            if (i%3!=0) {
                System.out.println(i);
            } else continue;
        }
    }
}
