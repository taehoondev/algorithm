package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(bufferedReader.readLine()));
        }
        Collections.sort(arr);

        for (int i = 0; i < n; i++) {
            stringBuilder.append(arr.get(i)+"\n");
        }
        System.out.print(stringBuilder.toString());
    }
}
