package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1085 {
    public static void main(String[] args) throws IOException {
        /*
        1. 4자리수 입력받는다.
        2. 스트링스키나이져로 각각 인트로 바꿔 입력받는다.
        3. 각각 다 곱하고 나눈다.
        4. 소수점 첫째까지 구한다.
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String getNumbers = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(getNumbers);

        double a = (double)Integer.parseInt(stringTokenizer.nextToken());
        double b = (double)Integer.parseInt(stringTokenizer.nextToken());
        double c = (double)Integer.parseInt(stringTokenizer.nextToken());
        double d = (double)Integer.parseInt(stringTokenizer.nextToken());

        double e = a*b*c*d/1024/1024/8;
        System.out.printf("%.1f",e);
        System.out.print(" "+"MB");
    }
}
