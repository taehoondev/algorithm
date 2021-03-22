package com.java;

import java.io.*;
import java.util.Arrays;

public class Solution_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            bufferedWriter.write(Integer.toString(arr[i])+"\n");
        }
        bufferedWriter.flush();
    }
}
