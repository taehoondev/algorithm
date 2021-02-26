package com.java;

import java.io.*;
import java.util.StringTokenizer;

public class Solution_1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        String getNumbers = bufferedReader.readLine();    // String
        StringTokenizer stringTokenizer = new StringTokenizer(getNumbers);
        int sum = 0;
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());  // int

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    bufferedWriter.write(String.valueOf(i) + " " + String.valueOf(j) + " " + String.valueOf(k));
                    bufferedWriter.newLine();
                    sum++;
                }
            }
        }
        bufferedWriter.write(String.valueOf(sum));
        bufferedWriter.flush();
        bufferedReader.close();
    }
}
