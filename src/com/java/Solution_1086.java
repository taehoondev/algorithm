package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String getnumbers = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(getnumbers);

        double a = Double.valueOf(stringTokenizer.nextToken());
        double b = Double.valueOf(stringTokenizer.nextToken());
        double c = Double.valueOf(stringTokenizer.nextToken());

        double answer = a*b*c/8/1024/1024;
        System.out.printf("%.2f",answer);
        System.out.print(" "+"MB");
    }
}
