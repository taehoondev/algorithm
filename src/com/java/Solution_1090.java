package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. 세 수 입력받는다.
2. a*b**(c-1)
 */
public class Solution_1090 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String[] arr = a.split(" ");

        int answer = (int) (Integer.parseInt(arr[0]) * Math.pow(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]) - 1));
        bufferedReader.close();

        System.out.println(answer);

    }
}
