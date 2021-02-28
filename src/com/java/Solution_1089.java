package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1089 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String[] arr = a.split(" ");

        int answer = Integer.parseInt(arr[0])+Integer.parseInt(arr[1])*(Integer.parseInt(arr[2])-1);
        System.out.println(answer);
    }
}
